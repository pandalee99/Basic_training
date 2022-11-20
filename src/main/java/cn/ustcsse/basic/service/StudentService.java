package cn.ustcsse.basic.service;

import java.util.List;
import cn.ustcsse.basic.domain.Student;
public interface StudentService{


    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertOrUpdate(Student record);

    int insertOrUpdateSelective(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int updateBatch(List<Student> list);

    int batchInsert(List<Student> list);



	List<Student> findByAll(Student student);

    List<Student> find();

}
