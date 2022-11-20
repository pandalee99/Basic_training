package cn.ustcsse.basic.service;
import cn.ustcsse.basic.domain.Teacher;

import java.util.List;
import cn.ustcsse.basic.domain.Manager;
public interface ManagerService{


    int deleteByPrimaryKey(Long id);

    int insert(Manager record);

    int insertOrUpdate(Manager record);

    int insertOrUpdateSelective(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);

    int updateBatch(List<Manager> list);

    int batchInsert(List<Manager> list);



	Manager selectOneByName(String name);



	List<Manager> get();



	List<Teacher> select();











}
