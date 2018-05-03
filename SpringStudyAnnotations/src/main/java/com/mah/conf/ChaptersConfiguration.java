package com.mah.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mah.bo.Chapter;
import com.mah.bo.Title;

@Import(TitlesConfiguration.class)
@Configuration
public class ChaptersConfiguration {
      @Autowired Title chapter1Title;
      @Bean
      public Chapter chapter1(){
            Chapter chapter = new Chapter();
            chapter.setContent("The content of chapter 1 goes here.");
            chapter.setNumber(1);
            chapter.setTitle(chapter1Title);
            return chapter;
      }
      
      @Autowired Title chapter2Title;
      @Bean
      public Chapter chapter2(){
            return new Chapter(2,chapter2Title,"The content of chapter 2 goes here.");
      }
}