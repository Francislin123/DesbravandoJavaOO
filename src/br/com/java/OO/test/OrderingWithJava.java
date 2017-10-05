package br.com.java.OO.test;

import br.com.java.OO.entity.Ebook;
import br.com.java.OO.entity.Magazine;
import br.com.java.OO.livraria.Author;
import br.com.java.OO.livraria.produtos.Product;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Francislin Dos Reis on 04/10/17.
 */
public class OrderingWithJava {

    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Frans kings");

        Magazine magazine = new Magazine();
        magazine.setName("Java OO");
        magazine.setValue(78.90);

        Ebook ebook = new Ebook(author);
        ebook.setName("Java OO");
        ebook.setValue(58.98);

        List<Product> products = Arrays.asList(magazine, ebook);

        Collections.sort(products);

        for (Product product : products) {
            System.out.println(product.getValue());
        }
    }
}
