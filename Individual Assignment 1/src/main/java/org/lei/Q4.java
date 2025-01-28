package org.lei;

import java.math.BigInteger;

public class Q4 {
    public static void main(String[] args) {
        int count = 100;

        BigInteger[] fibonacci = new BigInteger[count];
        fibonacci[0] = BigInteger.ONE;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        System.out.println("The first 100 Fibonacci numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ": " + fibonacci[i]);
        }
    }
}
