/*
02-July-26
*/

import java.util.Arrays;
import java.util.List;

public class FairRations80 {
     public static String fairRations(List<Integer> B) {
       int totalInitialSum=0;
       for (int b : B) totalInitialSum += b;

       //if totalInitialSum is odd, it's impossible to make everyone even
       if(totalInitialSum % 2 != 0) return "NO";
       else {
           int loaf = 0;
           
           //traverse upto second last person
           for (int i = 0; i < B.size()-1; i++) {
               int a = B.get(i);
               if (a % 2 != 0) {
                   B.set(i, B.get(i) + 1);  //giving 1 loaf to current person
                   B.set(i + 1, B.get(i + 1) + 1); // giving 1 loaf to next person
                   loaf += 2;
               }
           }
           return loaf+"";
       }

    }
    
    public static void main(String[] args) {
        List<Integer> b = Arrays.asList(4,5,6,7);

        System.out.println(fairRations(b));
    }
}