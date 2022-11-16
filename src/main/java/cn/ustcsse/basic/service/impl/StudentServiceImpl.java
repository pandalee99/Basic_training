package cn.ustcsse.basic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.ustcsse.basic.mapper.StudentMapper;
import java.util.List;
import cn.ustcsse.basic.domain.Student;
import cn.ustcsse.basic.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Student record) {
        return studentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Student record) {
        return studentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Student> list) {
        return studentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Student> list) {
        return studentMapper.batchInsert(list);
    }

}
