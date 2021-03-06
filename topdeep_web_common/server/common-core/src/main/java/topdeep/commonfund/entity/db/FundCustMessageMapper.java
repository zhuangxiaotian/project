package topdeep.commonfund.entity.db;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import topdeep.commonfund.entity.db.FundCustMessage;
import topdeep.commonfund.entity.db.FundCustMessageExample;

public interface FundCustMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int countByExample(FundCustMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int deleteByExample(FundCustMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int insert(FundCustMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int insertSelective(FundCustMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    List<FundCustMessage> selectByExample(FundCustMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    FundCustMessage selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FundCustMessage record, @Param("example") FundCustMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FundCustMessage record, @Param("example") FundCustMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FundCustMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_fund_cust_message
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FundCustMessage record);
}