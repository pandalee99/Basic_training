package cn.ustcsse.basic.service;

import java.util.List;
import cn.ustcsse.basic.domain.Course;
public interface CourseService{


    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertOrUpdate(Course record);

    int insertOrUpdateSelective(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    int updateBatch(List<Course> list);

    int batchInsert(List<Course> list);

}
