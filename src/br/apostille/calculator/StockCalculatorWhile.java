package br.apostille.calculator;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class StockCalculatorWhile {

    public static void main(String[] args) {

        double sum = 0;
        int counted = 0;
        int books = 35;

        while (counted < books) {
            double valueOfBook = 59.90;
            sum += valueOfBook;
            counted++;
            continue;
        }

        System.out.println("Total in stock is: " + sum);

        if (sum < 150) {
            System.out.println("Your stock is too low!");
        } else if (sum >= 2000) {
            System.out.println("Your stock is too high!");
        } else {
            System.out.println("you stock is good!");
        }
    }
}
