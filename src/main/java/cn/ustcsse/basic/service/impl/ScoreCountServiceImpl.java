package cn.ustcsse.basic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.ustcsse.basic.mapper.ScoreCountMapper;
import cn.ustcsse.basic.domain.ScoreCount;
import cn.ustcsse.basic.service.ScoreCountService;
@Service
public class ScoreCountServiceImpl implements ScoreCountService{

    @Resource
    private ScoreCountMapper scoreCountMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scoreCountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScoreCount record) {
        return scoreCountMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(ScoreCount record) {
        return scoreCountMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ScoreCount record) {
        return scoreCountMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(ScoreCount record) {
        return scoreCountMapper.insertSelective(record);
    }

    @Override
    public ScoreCount selectByPrimaryKey(Long id) {
        return scoreCountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoreCount record) {
        return scoreCountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoreCount record) {
        return scoreCountMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ScoreCount> list) {
        return scoreCountMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ScoreCount> list) {
        return scoreCountMapper.batchInsert(list);
    }

}
