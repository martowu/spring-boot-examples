package com.andy.security.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String account;

    private String password;

    private String description;

    private Integer age;

    private Date createTime;

    private boolean deleted;

    public User() {
    }

    public User(String account, String password, String description, Integer age, Date createTime, Boolean deleted) {
        this.account = account;
        this.password = password;
        this.description = description;
        this.age = age;
        this.createTime = createTime;
        this.deleted = deleted;
    }

    public User(Long userId, String account, String password, String description, Integer age, Date createTime, Boolean deleted) {
        this.userId = userId;
        this.account = account;
        this.password = password;
        this.description = description;
        this.age = age;
        this.createTime = createTime;
        this.deleted = deleted;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}

