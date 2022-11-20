package cn.ustcsse.basic.service.impl;
import cn.ustcsse.basic.domain.Teacher;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.ustcsse.basic.mapper.ManagerMapper;
import cn.ustcsse.basic.domain.Manager;
import cn.ustcsse.basic.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService{

    @Resource
    private ManagerMapper managerMapper;
    @org.springframework.beans.factory.annotation.Autowired
    private cn.ustcsse.basic.mapper.TeacherMapper teacherMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return managerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Manager record) {
        return managerMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Manager record) {
        return managerMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Manager record) {
        return managerMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Manager record) {
        return managerMapper.insertSelective(record);
    }

    @Override
    public Manager selectByPrimaryKey(Long id) {
        return managerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Manager record) {
        return managerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Manager record) {
        return managerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Manager> list) {
        return managerMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Manager> list) {
        return managerMapper.batchInsert(list);
    }

	@Override
	public Manager selectOneByName(String name){
		 return managerMapper.selectOneByName(name);
	}

	@Override
	public List<Manager> get(){
		 return managerMapper.get();
	}

	@Override
	public List<Teacher> select(){
		 return teacherMapper.select();
	}


















}
