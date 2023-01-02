package com.company2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCyclemain {

  public static void main(String[] args) {

    AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

    BeanLifecycle obj = (BeanLifecycle) context.getBean("beanlifecycle");
    obj.getMessage();
    context.registerShutdownHook();
  }

}
