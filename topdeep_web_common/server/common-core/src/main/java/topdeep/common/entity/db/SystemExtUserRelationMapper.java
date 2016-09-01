package topdeep.common.entity.db;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import topdeep.common.entity.db.SystemExtUserRelation;
import topdeep.common.entity.db.SystemExtUserRelationExample;

public interface SystemExtUserRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int countByExample(SystemExtUserRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int deleteByExample(SystemExtUserRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int insert(SystemExtUserRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int insertSelective(SystemExtUserRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    List<SystemExtUserRelation> selectByExample(SystemExtUserRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    SystemExtUserRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemExtUserRelation record, @Param("example") SystemExtUserRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemExtUserRelation record, @Param("example") SystemExtUserRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemExtUserRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_ext_user_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemExtUserRelation record);
}