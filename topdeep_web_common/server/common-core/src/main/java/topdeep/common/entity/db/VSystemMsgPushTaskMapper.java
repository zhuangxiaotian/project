package topdeep.common.entity.db;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import topdeep.common.entity.db.VSystemMsgPushTask;
import topdeep.common.entity.db.VSystemMsgPushTaskExample;

public interface VSystemMsgPushTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    int countByExample(VSystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    int deleteByExample(VSystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    int insert(VSystemMsgPushTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    int insertSelective(VSystemMsgPushTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    List<VSystemMsgPushTask> selectByExample(VSystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VSystemMsgPushTask record, @Param("example") VSystemMsgPushTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_system_msg_push_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VSystemMsgPushTask record, @Param("example") VSystemMsgPushTaskExample example);
}