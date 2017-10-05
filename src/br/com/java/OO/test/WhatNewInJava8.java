package br.com.java.OO.test;

import br.com.java.OO.entity.Book;
import br.com.java.OO.entity.PhysicalBook;
import br.com.java.OO.livraria.Author;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by Francislin Dos Reis on 05/10/17.
 */
public class WhatNewInJava8 {

    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Frans King");

        Book bookJavaOO = new PhysicalBook(author);
        bookJavaOO.setName("Java O.O.");

        Book bookJava8 = new PhysicalBook(author);
        bookJava8.setName("Java 8 in practice");

        Book ruby = new PhysicalBook(author);
        ruby.setName("Ruby book");

        List<Book> books = Arrays.asList(bookJavaOO, bookJava8, ruby);

        books.sort(comparing(Book::getName));

        books.forEach(l -> System.out.println(l.getName()));

        String filterBooks = "Java";

        List<Book> filter = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().contains(filterBooks)) {
                filter.add(book);
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Books filter by " + filterBooks);

        books.stream()
                .filter(b -> b.getName().contains(filterBooks))
                .forEach(b -> System.out.println(b.getName()));
    }
}
