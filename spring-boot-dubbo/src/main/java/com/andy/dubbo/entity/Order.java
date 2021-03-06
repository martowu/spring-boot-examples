package com.andy.dubbo.entity;

import java.util.Date;

/**
 * <p>
 *
 * @author Leone
 * @since 2018-06-25
 **/
public class Order {

    private Integer orderId;

    private String orderNo;

    private Integer userId;

    private Integer totalAmount;

    private Date createTime;

    public Order() {
    }

    public Order(Integer orderId, String orderNo, Integer userId, Integer totalAmount, Date createTime) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.createTime = createTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
