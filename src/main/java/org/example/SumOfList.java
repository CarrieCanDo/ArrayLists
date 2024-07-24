package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println();

        while (true) {
            try {
                int input = scanner.nextInt();
                if (input == 0) {
                    break;
                }
                integers.add(input);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        int sum = calculateSum(integers);

        if (!integers.isEmpty()) {
            // Print the list items
            for (int i = 0; i < integers.size(); i++) {
                if (i == integers.size() - 1 && integers.size() > 1) {
                    System.out.print("and " + integers.get(i));
                } else if (i == integers.size() - 1) {
                    System.out.print(integers.get(i));
                } else {
                    System.out.print(integers.get(i) + ", ");
                }
            }
            System.out.println(" were the items in the list. The sum of that list is: ");
        } else {
            System.out.println("The list is empty. The sum of that list is: 0");
        }

        // Print the sum on a new line
        System.out.println(sum);

        scanner.close();
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}

