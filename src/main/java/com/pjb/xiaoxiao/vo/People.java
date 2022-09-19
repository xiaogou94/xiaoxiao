package com.pjb.xiaoxiao.vo;

import lombok.Data;

/**
 * @program: xiaoxiao
 * @description: People
 * @author: xiao gou
 * @create: 2022-01-09 12:53
 */
@Data
public class People {

    private String name;

    private Integer age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
