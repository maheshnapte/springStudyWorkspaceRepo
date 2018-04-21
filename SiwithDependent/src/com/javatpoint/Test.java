package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// Resource r=new ClassPathResource("applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(r);
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee e = (Employee) factory.getBean("obj");
		e.displayInfo();

	}
}
