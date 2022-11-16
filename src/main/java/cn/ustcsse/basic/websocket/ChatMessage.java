package cn.ustcsse.basic.websocket;

import java.util.Date;
import java.util.zip.DataFormatException;

public class ChatMessage {
    private Date Date;
    private String UserName;

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getChatContent() {
        return ChatContent;
    }

    public void setChatContent(String chatContent) {
        ChatContent = chatContent;
    }

    private String ChatContent;
}
