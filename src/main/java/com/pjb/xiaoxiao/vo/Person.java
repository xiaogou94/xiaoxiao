package com.pjb.xiaoxiao.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @program: xiaoxiao
 * @description: 测试数据插入的实体
 * @author: xiao gou
 * @create: 2021-12-12 11:23
 */
public class Person {

    private Long id;
    private String name;
    private Long phone;
    private BigDecimal salary;
    private String company;
    private Integer ifSingle;
    private Integer sex;
    private String address;
    private LocalDateTime createTime;
    private String createUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getIfSingle() {
        return ifSingle;
    }

    public void setIfSingle(Integer ifSingle) {
        this.ifSingle = ifSingle;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    static class Builder{
        private Long id;
        private String name;
        private Long phone;
        private BigDecimal salary;
        private String company;
        private Integer ifSingle;
        private Integer sex;
        private String address;
        private LocalDateTime createTime;
        private String createUser;

        public Builder(){

        }

        public Builder(String name){
            this.name = name;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhone(Long phone) {
            this.phone = phone;
            return this;
        }

        public Builder setSalary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setIfSingle(Integer ifSingle) {
            this.ifSingle = ifSingle;
            return this;
        }

        public Builder setSex(Integer sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCreateTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
    }

}
