package com.school.graduate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.school.graduate.pojos.SchoolGraduate;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("app-context.xml");
		 SchoolGraduate sc=(SchoolGraduate) ctx.getBean("std1");
		 System.out.println(sc.toString());

	}

}
