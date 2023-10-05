package org.array;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("today " + dayOfWeek.getValue());
        System.out.println("Hello! Enter number");
        InputOfNumbers.input(list);
        System.out.println("");

        System.out.println("Choose what to do: ");
        System.out.println("1. Count sum devided by day");
        System.out.println("2. Array size");
        System.out.println("3. Numbers in array");

        while (true) {
            try {
                int input = Integer.valueOf(scanner.nextLine());
                if(input == 0 || input == 1 || input == 2 || input == 3){
                    if (input == 0) {
                        break;
                    }

                    if(input == 1){
                        System.out.println("Result: " + ArraySum.sum(list, dayOfWeek));
                    }
                    if(input == 2){
                        System.out.println("Size: " + ArraySize.size(list));
                    }
                    if(input == 3){
                        System.out.println("Numbers in array: ");
                        NumbersInArray.numbers(list);
                    }
                }
                else{
                    System.out.println("Invalid input. Please enter an integer.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}