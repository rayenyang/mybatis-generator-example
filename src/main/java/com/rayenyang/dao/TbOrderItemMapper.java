package com.rayenyang.dao;

import com.rayenyang.pojo.TbOrderItem;
import com.rayenyang.pojo.TbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    long countByExample(TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int deleteByExample(TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int insert(TbOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int insertSelective(TbOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    TbOrderItem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(TbOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * @mbg.generated Tue Aug 22 15:48:25 GMT+08:00 2017
     */
    int updateByPrimaryKey(TbOrderItem record);
}