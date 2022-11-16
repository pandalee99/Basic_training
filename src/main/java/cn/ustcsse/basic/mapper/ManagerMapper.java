package cn.ustcsse.basic.mapper;

import cn.ustcsse.basic.domain.Manager;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ManagerMapper {
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
    int insert(Manager record);

    int insertOrUpdate(Manager record);

    int insertOrUpdateSelective(Manager record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Manager record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Manager selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Manager record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Manager record);

    int updateBatch(List<Manager> list);

    int batchInsert(@Param("list") List<Manager> list);

    Manager selectOneByName(@Param("name")String name);


}