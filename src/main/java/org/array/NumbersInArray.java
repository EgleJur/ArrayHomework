package org.array;

import java.util.ArrayList;

public class NumbersInArray {
    public static void numbers(ArrayList<Integer> list){
        for (int i:
             list) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
