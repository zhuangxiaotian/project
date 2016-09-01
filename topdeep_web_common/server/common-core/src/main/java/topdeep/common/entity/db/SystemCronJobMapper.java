package topdeep.common.entity.db;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import topdeep.common.entity.db.SystemCronJob;
import topdeep.common.entity.db.SystemCronJobExample;

public interface SystemCronJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int countByExample(SystemCronJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int deleteByExample(SystemCronJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int insert(SystemCronJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int insertSelective(SystemCronJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    List<SystemCronJob> selectByExample(SystemCronJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    SystemCronJob selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemCronJob record, @Param("example") SystemCronJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemCronJob record, @Param("example") SystemCronJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemCronJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_cron_job
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemCronJob record);
}