package com.mutyala.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mutyala.jpa.book.Book;
import com.mutyala.jpa.book.BookRepository;
import com.mutyala.jpa.book.Publisher;

@Slf4j
@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a couple of Book and Publisher
        bookRepository.save(new Book("Book 1", new Publisher("Publisher A"), new Publisher("Publisher B")));
    }
}
