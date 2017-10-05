package br.com.java.OO.entity;

import br.com.java.OO.exception.AuthorNullException;
import br.com.java.OO.livraria.Author;
import br.com.java.OO.livraria.produtos.Product;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class Book implements Product {

    private String name;
    private String description;
    private double value;
    private String isbn;
    private Author author;
    private boolean printed;

    public Book(Author author) {
        if (author == null) {
            throw new AuthorNullException("Book Author can not be null");
        }
        this.author = author;
        this.isbn = "000-00-00000-00-0";
    }

    @Override
    public int compareTo(Product product) {

        return (int) (this.getValue() - product.getValue());
    }

    public Book() {
        System.out.println("Constructor empty");
    }

    public void ShowDetails() {
        System.out.println("-----------------------------------------------------------------------------------------");
        String message = "Showing Book Details";
        System.out.println(message);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Value: " + value);
        System.out.println("Identification number: " + isbn);

        if (this.author != null) {
            author.ShowDetailsAuthor();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Boolean getPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return this.name.equals(book.getName());
    }

    @Override
    public String toString() {
        return "I am Book";
    }
}
