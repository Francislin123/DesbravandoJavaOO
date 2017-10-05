package br.com.java.OO.business;

import br.com.java.OO.livraria.produtos.Product;

import java.util.ArrayList;

/**
 * Created by Francislin Dos Reis on 04/09/17.
 */
public class ShoppingCart {

    private double total;

    private ArrayList<Product> products;

    private int counter = 0;

    public void add(Product product) {
        System.out.println("Add Books..." + product);
        this.products = new ArrayList<>();
        counter++;
        this.total += product.getValue();
    }

    public double getTotal() {
        return this.total;
    }
}
