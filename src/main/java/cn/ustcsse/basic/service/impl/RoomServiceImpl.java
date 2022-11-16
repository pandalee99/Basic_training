package cn.ustcsse.basic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.ustcsse.basic.mapper.RoomMapper;
import java.util.List;
import cn.ustcsse.basic.domain.Room;
import cn.ustcsse.basic.service.RoomService;
@Service
public class RoomServiceImpl implements RoomService{

    @Resource
    private RoomMapper roomMapper;

    @Override
    public int deleteByPrimaryKey(Long roomID) {
        return roomMapper.deleteByPrimaryKey(roomID);
    }

    @Override
    public int insert(Room record) {
        return roomMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Room record) {
        return roomMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Room record) {
        return roomMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Room record) {
        return roomMapper.insertSelective(record);
    }

    @Override
    public Room selectByPrimaryKey(Long roomID) {
        return roomMapper.selectByPrimaryKey(roomID);
    }

    @Override
    public int updateByPrimaryKeySelective(Room record) {
        return roomMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Room record) {
        return roomMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Room> list) {
        return roomMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Room> list) {
        return roomMapper.batchInsert(list);
    }

}
