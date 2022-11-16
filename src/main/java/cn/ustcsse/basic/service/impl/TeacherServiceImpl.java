package cn.ustcsse.basic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.ustcsse.basic.domain.Teacher;
import cn.ustcsse.basic.mapper.TeacherMapper;
import cn.ustcsse.basic.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService{

    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Teacher record) {
        return teacherMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Teacher record) {
        return teacherMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Teacher record) {
        return teacherMapper.insertSelective(record);
    }

    @Override
    public Teacher selectByPrimaryKey(Long id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Teacher> list) {
        return teacherMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Teacher> list) {
        return teacherMapper.batchInsert(list);
    }

}
