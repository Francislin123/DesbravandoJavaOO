package br.com.java.OO.entity;

import br.com.java.OO.livraria.produtos.Promotion;
import br.com.java.OO.livraria.Author;

/**
 * Created by Francislin Dos Reis on 05/09/17.
 */
public class PhysicalBook extends Book implements Promotion {

    public PhysicalBook(Author author) {
        super(author);
    }

    public PhysicalBook() {}

    @Override
    public boolean applyDiscountFromBook(double percentage) {
            if (percentage > 0.3) {
                System.out.println("Discount can not be more than 15%");
                return false;
            }
            double discount = getValue() * percentage;
            setValue(getValue() - discount);
            return false;
    }
}
