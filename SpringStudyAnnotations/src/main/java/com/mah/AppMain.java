package com.mah;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mah.bo.Book;
import com.mah.conf.BooksConfiguration;

public class AppMain {

	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BooksConfiguration.class);

		// Byname Autowiring
		Book book = (Book) context.getBean("myFirstSpringBook");
		System.out.println("Application Details : " + book);

		// Byname Autowiring
		Book book2 = (Book) context.getBean("mySecondSpringBook");
		System.out.println("Application Details : " + book2);

		// Book myFirstSpringBook = (Book) beanFactory.getBean("myFirstSpringBook");

		// // ByType Autowiring
		// Employee employee = (Employee) context.getBean("employee");
		// System.out.println("Employee Details : " + employee);
		//
		// // By Constructor Autowiring
		// Performer performer = (Performer) context.getBean("performer");
		// System.out.println("Performer Details : " + performer);
		//
		// // Setter Autowiring
		// Driver driver = (Driver) context.getBean("driver");
		// System.out.println("Driver Details : " + driver);
		//
		// Bond bond = (Bond) context.getBean("bond");
		// bond.showCar();
	}

}
