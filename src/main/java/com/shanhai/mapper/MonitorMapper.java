package com.shanhai.mapper;

import com.shanhai.domain.Monitor;

public interface MonitorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor
     *
     * @mbggenerated
     */
    int insert(Monitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor
     *
     * @mbggenerated
     */
    int insertSelective(Monitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor
     *
     * @mbggenerated
     */
    Monitor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Monitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Monitor record);
}