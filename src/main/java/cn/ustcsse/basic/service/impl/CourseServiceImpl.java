package cn.ustcsse.basic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.ustcsse.basic.mapper.CourseMapper;
import cn.ustcsse.basic.domain.Course;
import cn.ustcsse.basic.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{

    @Resource
    private CourseMapper courseMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Course record) {
        return courseMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Course record) {
        return courseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Course record) {
        return courseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Course record) {
        return courseMapper.insertSelective(record);
    }

    @Override
    public Course selectByPrimaryKey(Long id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Course record) {
        return courseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Course> list) {
        return courseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Course> list) {
        return courseMapper.batchInsert(list);
    }

}
