package org.lei;

public class Q1 {
    public static void main(String[] args) {
        int maxNumber = 12;
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%2d * %2d = %3d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}