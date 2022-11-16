package cn.ustcsse.basic.websocket;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


@ServerEndpoint(value = "/consult/{roomID}")
@RestController
public class ConsultWebSocket {

    // 使用map来收集session，key为roomID，value为同一个房间的用户集合
    private static final Map<String, Set<Session>> rooms = new ConcurrentHashMap<>();
    //缓存session对应的用户
    private static final Map<String, String> users = new ConcurrentHashMap<>();

    @OnOpen
    public void connect(@PathParam("roomID") String roomID, Session session) throws IOException {

        //目前使用随机名称，可以整合自己的session管理，如shiro之类的
        String name = randomName();

        // 将session按照房间名来存储，将各个房间的用户隔离
        if (!rooms.containsKey(roomID)) {
            // 创建房间不存在时，创建房间
            Set<Session> room = new HashSet<>();
            // 添加用户
            room.add(session);
            rooms.put(roomID, room);
        } else {
            // 房间已存在，直接添加用户到相应的房间
            rooms.get(roomID).add(session);
        }

        users.put(session.getId(), name);

        //向上线的人发送当前在线的人的列表
        List<ChatMessage> userList = new LinkedList<>();
        rooms.get(roomID)
                .stream()
                .map(Session::getId)
                .forEach(s -> {
                    ChatMessage chatMessage = new ChatMessage();
                    chatMessage.setDate(new Date());
                    chatMessage.setUserName("sys");
                    chatMessage.setChatContent(users.get(s) + "在线");
                    userList.add(chatMessage);
                });
        session.getBasicRemote().sendText(JSON.toJSONString(userList));

        //向房间的所有人广播谁上线了
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setDate(new Date());
        chatMessage.setUserName("sys");
        chatMessage.setChatContent(users.get(session.getId()) + "上线了");
        broadcast(roomID, JSON.toJSONString(chatMessage));
    }

    @OnClose
    public void disConnect(@PathParam("roomName") String roomName, Session session) {
        rooms.get(roomName).remove(session);
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setDate(new Date());
        chatMessage.setUserName("sys");
        chatMessage.setChatContent(users.get(session.getId()) + "下线了");
        users.remove(session.getId());
        broadcast(roomName, JSON.toJSONString(chatMessage));

    }

    @OnMessage
    public void receiveMsg(@PathParam("roomID") String roomID,
                           String msg, Session session) {
        // 此处应该有html过滤，进行数据加工
        msg = users.get(session.getId()) + ":" + msg;
        // 接收到信息后进行广播
        broadcast(roomID, msg);
    }


    // 按照房间名进行广播
    private void broadcast(String roomName, String msg) {
        rooms.get(roomName).forEach(s -> {
            try {
                s.getBasicRemote().sendText(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        /*  将聊天记录加入缓存

         */
    }





    //随机姓名
    private String randomName() {
        Random random = new Random();
        String str = "";
        int hightPos, lowPos;
        for (int i = 0; i < 4; ++i) {
            hightPos = (176 + Math.abs(random.nextInt(39)));
            lowPos = (161 + Math.abs(random.nextInt(93)));
            byte[] b = new byte[2];
            b[0] = (Integer.valueOf(hightPos)).byteValue();
            b[1] = (Integer.valueOf(lowPos)).byteValue();
            try {
                str += new String(b, "GB2312");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return str;
    }


}