package cn.ustcsse.basic.mapper;

import cn.ustcsse.basic.domain.Course;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseMapper {
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
    int insert(Course record);

    int insertOrUpdate(Course record);

    int insertOrUpdateSelective(Course record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Course record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Course selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Course record);

    int updateBatch(List<Course> list);

    int batchInsert(@Param("list") List<Course> list);
}