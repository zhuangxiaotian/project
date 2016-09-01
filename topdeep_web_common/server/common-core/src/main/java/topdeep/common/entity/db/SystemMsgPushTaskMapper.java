package topdeep.common.entity.db;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import topdeep.common.entity.db.SystemMsgPushTask;
import topdeep.common.entity.db.SystemMsgPushTaskExample;

public interface SystemMsgPushTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int countByExample(SystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int deleteByExample(SystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int insert(SystemMsgPushTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int insertSelective(SystemMsgPushTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    List<SystemMsgPushTask> selectByExample(SystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    SystemMsgPushTask selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemMsgPushTask record, @Param("example") SystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemMsgPushTask record, @Param("example") SystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemMsgPushTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_msg_push_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemMsgPushTask record);
}