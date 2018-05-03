package com.mah.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mah.bo.Title;

@Configuration
@PropertySource("classpath:beans.properties")
public class TitlesConfiguration {
      @Autowired Environment env;
  
      @Bean
      public Title bookTitle(){
            Title title = new Title();
            title .setTitleValue(env.getProperty("myFirstSpringBook.title"));
            return title ;
      }
  
      @Bean
      public Title chapter1Title(){
            return new Title(env.getProperty("myFirstSpringBook.chapter1.title"));
      }
      
      @Bean
      public Title chapter2Title(){
            return new Title(env.getProperty("myFirstSpringBook.chapter2.title"));
      }
 }