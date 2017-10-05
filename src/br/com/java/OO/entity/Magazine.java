package br.com.java.OO.entity;

import br.com.java.OO.livraria.PublishingCompany;
import br.com.java.OO.livraria.produtos.Product;
import br.com.java.OO.livraria.produtos.Promotion;

/**
 * Created by vn0gshm on 05/09/17.
 */
public class Magazine implements Product, Promotion {

    private String name;
    private String description;
    private double value;
    private PublishingCompany publishingCompany;

    public boolean applyDiscountFromBook(double percentage) {
        if (percentage > 0.1) {
            return false;
        }
        double discout = getValue() * percentage;
        setValue(getValue() - discout);
        return true;
    }

    @Override
    public int compareTo(Product product) {return (int) (this.getValue() - product.getValue());}

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

    public PublishingCompany getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(PublishingCompany publishingCompany) {this.publishingCompany = publishingCompany;}

}
