package topdeep.commonfund.entity.db;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import topdeep.commonfund.entity.db.FundMessageRecord;
import topdeep.commonfund.entity.db.FundMessageRecordExample;

public interface FundMessageRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    int countByExample(FundMessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    int deleteByExample(FundMessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    int insert(FundMessageRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    int insertSelective(FundMessageRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    List<FundMessageRecord> selectByExample(FundMessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FundMessageRecord record, @Param("example") FundMessageRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_message_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FundMessageRecord record, @Param("example") FundMessageRecordExample example);
}