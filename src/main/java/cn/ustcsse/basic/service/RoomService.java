package cn.ustcsse.basic.service;

import java.util.List;
import cn.ustcsse.basic.domain.Room;
public interface RoomService{


    int deleteByPrimaryKey(Long roomID);

    int insert(Room record);

    int insertOrUpdate(Room record);

    int insertOrUpdateSelective(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Long roomID);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    int updateBatch(List<Room> list);

    int batchInsert(List<Room> list);

}
