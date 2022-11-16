package cn.ustcsse.basic.service;

import java.util.List;
import cn.ustcsse.basic.domain.Teacher;
public interface TeacherService{


    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    int insertOrUpdate(Teacher record);

    int insertOrUpdateSelective(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    int updateBatch(List<Teacher> list);

    int batchInsert(List<Teacher> list);

}
