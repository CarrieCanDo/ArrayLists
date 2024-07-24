package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        System.out.println("The size of the list is: " + strings.size());

        scanner.close();
    }
}
