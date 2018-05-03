package com.mah.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mah.bo.Book;
import com.mah.bo.Chapter;
import com.mah.bo.Title;

@Import(ChaptersConfiguration.class)
@Configuration
@PropertySource("classpath:beans.properties")
public class BooksConfiguration {
	@Autowired
	Environment env;

	@Autowired
	Title bookTitle;
	@Autowired
	Chapter chapter1;
	@Autowired
	Chapter chapter2;

	@Bean
	public Book myFirstSpringBook() {
		Book book = new Book();
		book.setIsbn(1);
		book.setAuthor(env.getProperty("myFirstSpringBook.author"));
		book.setTitle(bookTitle);
		List<Chapter> chapters = new ArrayList<Chapter>();
		chapters.add(chapter1);
		chapters.add(chapter2);
		book.setChapters(chapters);
		return book;
	}

	@Bean
	public Book mySecondSpringBook() {
		Book book = new Book();
		book.setIsbn(1);
		book.setAuthor("Mr. XYZ");
		book.setTitle(bookTitle);
		List<Chapter> chapters = new ArrayList<Chapter>();
		chapters.add(chapter1);
		chapters.add(chapter2);
		book.setChapters(chapters);
		return book;
	}
}