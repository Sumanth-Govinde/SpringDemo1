package com.slk.training.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.beans.*;

public class App {
	public static void main(String args[]) {
		
		//IOC Container
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);//ClassPathXmlApplicationContext("beans.xml");
		Samsung s1=(Samsung)context.getBean("s1");
		s1.movie();
		System.out.println(s1);
	}

}
