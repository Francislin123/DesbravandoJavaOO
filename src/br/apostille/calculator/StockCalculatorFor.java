package br.apostille.calculator;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class StockCalculatorFor {

    public static void main(String[] args) {

        double sum = 0;

        for (int books = 0; books < 35; books++) {
            sum += 59.90;
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
