package com.wz.springlearning.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wz.springlearning.entities.User;
import com.wz.springlearning.service.UserService;

public class Test {

    public static void main(String[] args) {
	System.out.println("-------------Spring Learning-------------");

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
	
//	UserService userService = (UserService)applicationContext.getBean("userService");
//	
//	System.out.println(userService);
	
	System.out.println(applicationContext.getBean("userServiceImpl"));
	
    }

}
