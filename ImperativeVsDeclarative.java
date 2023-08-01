package com.dsa;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {

        /*
         * This is imperative style.
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        /*
         * This is declarative style.
         */
        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println(sum1);
    }
}
