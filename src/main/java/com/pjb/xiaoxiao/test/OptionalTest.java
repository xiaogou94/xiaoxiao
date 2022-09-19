package com.pjb.xiaoxiao.test;

import com.pjb.xiaoxiao.vo.People;
import com.pjb.xiaoxiao.vo.Person;

import java.util.Optional;

/**
 * @program: xiaoxiao
 * @description: OptionalTest
 * @author: xiao gou
 * @create: 2022-01-09 12:52
 */
public class OptionalTest {

  public static void main(String[] args) {
    //
      People person = new People("xiaoxiao",13);
      person.setName(null);
      person.setAge(null);
      String name = getName(person);
    System.out.println(name);
  }

    private static String getName(People person) {
      String name = Optional.ofNullable(person).map(x->x.getName()).orElse("空指针");
      return name;
    }
}
