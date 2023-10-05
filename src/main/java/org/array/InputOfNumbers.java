package org.array;

import java.util.ArrayList;
import java.util.Scanner;

public class InputOfNumbers {
    public static ArrayList<Integer> input(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int input = Integer.valueOf(scanner.nextLine());
                if (input == 0) {
                    break;
                }

                list.add(input);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return list;
    }
}
