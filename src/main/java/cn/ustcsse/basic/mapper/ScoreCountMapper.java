package cn.ustcsse.basic.mapper;

import cn.ustcsse.basic.domain.ScoreCount;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScoreCountMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ScoreCount record);

    int insertOrUpdate(ScoreCount record);

    int insertOrUpdateSelective(ScoreCount record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ScoreCount record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    ScoreCount selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ScoreCount record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ScoreCount record);

    int updateBatch(List<ScoreCount> list);

    int batchInsert(@Param("list") List<ScoreCount> list);
}