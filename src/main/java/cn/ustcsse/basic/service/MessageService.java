package cn.ustcsse.basic.service;

import java.util.List;
import cn.ustcsse.basic.domain.Message;
public interface MessageService{


    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertOrUpdate(Message record);

    int insertOrUpdateSelective(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int updateBatch(List<Message> list);

    int batchInsert(List<Message> list);

}
