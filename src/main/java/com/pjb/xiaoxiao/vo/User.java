package com.pjb.xiaoxiao.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @program: xiaoxiao
 * @description: 用户
 * @author: xiao gou
 * @create: 2021-10-28 21:23
 */
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Integer departId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public static void main(String[] args) {
    //
      List<User> list = new ArrayList<>();
      for (User u:list){
      System.out.println(u.toString());
      }

      list.forEach(user -> user.toString());

      for (User u:list){
          if (u.getAge() >=15 && u.getAge() <=17){
              list.add(u);
          }
      }

      List<User> users = list.stream().filter(user -> user.getAge()>=15 && user.getAge()<=17).collect(Collectors.toList());


        Map<Integer,User> userMap = new HashMap<>();
        for (User u:list){
            if (!userMap.containsKey(u.getId())){
                userMap.put(u.getId(),u);
            }
        }

        Map<Integer,User> map = list.stream().collect(Collectors.toMap(User::getId, Function.identity(),(m1,m2)->m1));


        Map<Integer,List<User>> departGroupMap = new HashMap<>();
        for (User u:list) {
            if (departGroupMap.containsKey(u.getDepartId())){
                departGroupMap.get(u.getDepartId()).add(u);
            }else {
                List<User> users1 = new ArrayList<>();
                users1.add(u);
                departGroupMap.put(u.getDepartId(),users1);
            }
        }


        Map<Integer,List<User>> departGroupMap1 = list.stream().collect(Collectors.groupingBy(User::getDepartId));
    }
}
