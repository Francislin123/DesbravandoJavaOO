package br.apostille.calculator;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class ConditionalStockCalculator {

    public static void main(String[] args) {

        double bookJava8 = 59.90;
        double bookTDD = 59.90;

        double sum = bookJava8 + bookTDD;

        System.out.println("The total in stock and: " + sum);

        if (sum < 150) {
            System.out.println("Your stock is too low!");
        } else if (sum >= 200) {
            System.out.println("Your stock is very good");
        } else {
            System.out.println("Your stock is good");
        }
    }
}
