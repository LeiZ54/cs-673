package org.lei;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter a string:");

        while (true) {
            System.out.print("Input: ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (isPalindrome(input)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }

        scanner.close();
    }
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
