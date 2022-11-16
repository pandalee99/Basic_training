package cn.ustcsse.basic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.ustcsse.basic.domain.Message;
import cn.ustcsse.basic.mapper.MessageMapper;
import cn.ustcsse.basic.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService{

    @Resource
    private MessageMapper messageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Message record) {
        return messageMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Message record) {
        return messageMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public Message selectByPrimaryKey(Long id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Message> list) {
        return messageMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Message> list) {
        return messageMapper.batchInsert(list);
    }

}
