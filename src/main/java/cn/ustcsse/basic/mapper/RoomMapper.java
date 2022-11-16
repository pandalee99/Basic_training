package cn.ustcsse.basic.mapper;

import cn.ustcsse.basic.domain.Room;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoomMapper {
    /**
     * delete by primary key
     * @param roomID primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long roomID);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Room record);

    int insertOrUpdate(Room record);

    int insertOrUpdateSelective(Room record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Room record);

    /**
     * select by primary key
     * @param roomID primary key
     * @return object by primary key
     */
    Room selectByPrimaryKey(Long roomID);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Room record);

    int updateBatch(List<Room> list);

    int batchInsert(@Param("list") List<Room> list);
}