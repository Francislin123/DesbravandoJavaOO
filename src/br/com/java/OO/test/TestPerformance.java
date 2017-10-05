package br.com.java.OO.test;

import java.util.HashSet;

/**
 * Created by Francislin Dos Reis on 04/10/17.
 */
public class TestPerformance {

    public static void main(String[] args) {

        HashSet<String> collection = new HashSet<>();

        //List<String> collection = new ArrayList<>(); //total time: -321

        for (int i = 0; i < 10000; i++) {
            collection.add("Item" + i);
        }

        long begin = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            collection.contains("Item" + i);
        }

        long end = System.currentTimeMillis();
        long time = begin - end;

        System.out.println("Total time execution program: " + time);
    }
}
