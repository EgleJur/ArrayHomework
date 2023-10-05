package org.array;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class ArraySum {
    public static int sum(ArrayList<Integer> list, DayOfWeek dayOfWeek){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);

        }
        return sum/dayOfWeek.getValue();
    }
}
