/*
05-July-06
*/

import java.util.Arrays;
import java.util.List;

public class RunningTimeOfAlgorithms95 {
    public static int runningTime(List<Integer> arr) {
        int totalShifts=0;

        for (int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > value) {
                arr.set(j+1, arr.get(j));
                totalShifts++;
                j = j - 1;
            }
            arr.set(j+1, value);
        }

        return totalShifts;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 1, 3, 1, 2);

        System.out.println(runningTime(arr));
    }
    
}