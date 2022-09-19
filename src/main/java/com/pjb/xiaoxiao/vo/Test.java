package com.pjb.xiaoxiao.vo;

import java.lang.reflect.Field;

/**
 * @program: xiaoxiao
 * @description: Test
 * @author: xiao gou
 * @create: 2021-11-26 21:14
 */
public class Test {
  public static void main(String[] args) throws IllegalAccessException {
    //
      TestVO testVO = new TestVO();
      testVO.setMc("1");
    System.out.println(testVO);
    if (isAllFieldNull(testVO)) {
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }

    /**
     * 判断该对象是否:返回true表示所有的属性为null 返回false表示不是所有属性是null
     * @param object
     * @return
     */
  public static boolean isAllFieldNull(Object object) throws IllegalAccessException {
      Class<?> aClass = object.getClass();
      Field[] fs = aClass.getDeclaredFields();
      boolean flag = true;
      for (Field f : fs){
          f.setAccessible(true);
          Object o = f.get(object);
          if (o!=null){
              flag = false;
          }
      }
      return flag;
  }
}
