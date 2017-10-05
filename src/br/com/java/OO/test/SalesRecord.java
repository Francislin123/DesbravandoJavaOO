package br.com.java.OO.test;

import br.com.java.OO.livraria.Author;
import br.com.java.OO.entity.Book;
import br.com.java.OO.entity.Ebook;

/**
 * Created by vn0gshm on 04/09/17.
 */
public class SalesRecord {
    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Mauricio Aniche");

        Book ebook = new Ebook(author);
        ebook.setName("Test-Driven Development");
    }
}
