package com.events.domain;

import java.math.BigDecimal;
import java.util.Date;

public class UserTransfer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.FROM
     *
     * @mbggenerated
     */
    private String from;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.TO
     *
     * @mbggenerated
     */
    private String to;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.SIGN
     *
     * @mbggenerated
     */
    private String sign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.ROW_ADDTIME
     *
     * @mbggenerated
     */
    private Date rowAddtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.ROW_UPDATETIME
     *
     * @mbggenerated
     */
    private Date rowUpdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_transfer.ENV
     *
     * @mbggenerated
     */
    private String env;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.ID
     *
     * @return the value of user_transfer.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.ID
     *
     * @param id the value for user_transfer.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.FROM
     *
     * @return the value of user_transfer.FROM
     *
     * @mbggenerated
     */
    public String getFrom() {
        return from;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.FROM
     *
     * @param from the value for user_transfer.FROM
     *
     * @mbggenerated
     */
    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.TO
     *
     * @return the value of user_transfer.TO
     *
     * @mbggenerated
     */
    public String getTo() {
        return to;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.TO
     *
     * @param to the value for user_transfer.TO
     *
     * @mbggenerated
     */
    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.AMOUNT
     *
     * @return the value of user_transfer.AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.AMOUNT
     *
     * @param amount the value for user_transfer.AMOUNT
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.SIGN
     *
     * @return the value of user_transfer.SIGN
     *
     * @mbggenerated
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.SIGN
     *
     * @param sign the value for user_transfer.SIGN
     *
     * @mbggenerated
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.ROW_ADDTIME
     *
     * @return the value of user_transfer.ROW_ADDTIME
     *
     * @mbggenerated
     */
    public Date getRowAddtime() {
        return rowAddtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.ROW_ADDTIME
     *
     * @param rowAddtime the value for user_transfer.ROW_ADDTIME
     *
     * @mbggenerated
     */
    public void setRowAddtime(Date rowAddtime) {
        this.rowAddtime = rowAddtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.ROW_UPDATETIME
     *
     * @return the value of user_transfer.ROW_UPDATETIME
     *
     * @mbggenerated
     */
    public Date getRowUpdatetime() {
        return rowUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.ROW_UPDATETIME
     *
     * @param rowUpdatetime the value for user_transfer.ROW_UPDATETIME
     *
     * @mbggenerated
     */
    public void setRowUpdatetime(Date rowUpdatetime) {
        this.rowUpdatetime = rowUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_transfer.ENV
     *
     * @return the value of user_transfer.ENV
     *
     * @mbggenerated
     */
    public String getEnv() {
        return env;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_transfer.ENV
     *
     * @param env the value for user_transfer.ENV
     *
     * @mbggenerated
     */
    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }
}