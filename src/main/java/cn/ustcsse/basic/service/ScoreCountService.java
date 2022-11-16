package cn.ustcsse.basic.service;

import java.util.List;
import cn.ustcsse.basic.domain.ScoreCount;
public interface ScoreCountService{


    int deleteByPrimaryKey(Long id);

    int insert(ScoreCount record);

    int insertOrUpdate(ScoreCount record);

    int insertOrUpdateSelective(ScoreCount record);

    int insertSelective(ScoreCount record);

    ScoreCount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScoreCount record);

    int updateByPrimaryKey(ScoreCount record);

    int updateBatch(List<ScoreCount> list);

    int batchInsert(List<ScoreCount> list);

}
