/*
05-July-26
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones99 {
    public static List<Integer> stones(int n, int a, int b) {
         //TreeSet stores elements uniquely and keeps them sorted
         Set<Integer> uniqueFinalvalues = new TreeSet<>();
         int totalSteps = n-1;

         // i represents the number of times we choose value 'b'
         for (int i = 0; i <= totalSteps; i++) {
            int currentFinalValue = (i*b) + ((totalSteps-i)*a);
            uniqueFinalvalues.add(currentFinalValue);
         }

         return new ArrayList<Integer>(uniqueFinalvalues);
    }
    
    public static void main(String[] args) {
        int n = 8;
        int a = 9;
        int b = 6;

        System.out.println(stones(n, a, b));
    }
}