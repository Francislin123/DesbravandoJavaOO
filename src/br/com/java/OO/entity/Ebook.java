package br.com.java.OO.entity;

import br.com.java.OO.livraria.produtos.Promotion;
import br.com.java.OO.livraria.Author;

/**
 * Created by Francislin Dos Reis on 04/09/17.
 */
public class Ebook extends Book implements Promotion {

    private String waterMark;

    public Ebook(Author author) {
        super(author);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public String toString() {
        return "I am Ebook";
    }

    @Override
    public boolean applyDiscountFromBook(double percentage) {
        if (percentage > 0.3) {
            System.out.println("Discount can not be more than 15%");
            return false;
        }
        double discount = getValue() * percentage;
        setValue(getValue() - discount);
        return true;
    }
}
