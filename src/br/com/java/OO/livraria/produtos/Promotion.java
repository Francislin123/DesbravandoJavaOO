package br.com.java.OO.livraria.produtos;

/**
 * Created by Francislin Dos Reis on 04/09/17.
 */
@FunctionalInterface
public interface Promotion {

    boolean applyDiscountFromBook(double percentage);
}
