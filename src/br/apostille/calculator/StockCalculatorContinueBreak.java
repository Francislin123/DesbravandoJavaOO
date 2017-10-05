package br.apostille.calculator;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class StockCalculatorContinueBreak {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
