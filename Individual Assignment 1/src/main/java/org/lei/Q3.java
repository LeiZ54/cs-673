package org.lei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two lists in the format [a,b,c] and [1,2,3]:");

        System.out.print("List1: ");
        String firstInput = scanner.nextLine();

        System.out.print("List2: ");
        String secondInput = scanner.nextLine();

        List<String> firstList = parseList(firstInput);
        List<String> secondList = parseList(secondInput);

        if (firstList == null || secondList == null) {
            System.out.println("Error: Invalid list format. Use the format [a,b,c].");
        } else if (firstList.size() != secondList.size()) {
            System.out.println("Error: Lists are not of equal length.");
        } else {
            List<String> combinedList = combine(firstList, secondList);
            System.out.println("Combined list: " + combinedList);
        }

        scanner.close();
    }

    private static List<String> parseList(String input) {
        if (input.startsWith("[") && input.endsWith("]")) {
            String[] elements = input.substring(1, input.length() - 1).split(",");
            List<String> list = new ArrayList<>();
            for (String element : elements) {
                list.add(element.trim());
            }
            return list;
        }
        return null;
    }

    private static List<String> combine(List<String> list1, List<String> list2) {
        List<String> combined = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            combined.add(list1.get(i));
            combined.add(list2.get(i));
        }
        return combined;
    }
}
