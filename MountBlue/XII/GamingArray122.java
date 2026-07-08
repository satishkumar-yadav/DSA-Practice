/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GamingArray122 {
    //TLE
    public static String gamingArray2(List<Integer> arr) {
      int n = arr.size();
      int move = 0;
      
      while (n>0) {
        int max = Collections.max(arr);
        int maxIndex = arr.indexOf(max);
        arr = arr.subList(0, maxIndex);
        move++;
        n = arr.size();   
      }
     
      if(move % 2 != 0) return "BOB";
      else return "ANDY";

    }

    //optimised code
    public static String gamingArray(List<Integer> arr) {
       int moves = 0;
       int max = Integer.MIN_VALUE;

       for (int i = 0; i < arr.size(); i++) {
         int currElement = arr.get(i);
         if(currElement>max){
            max = currElement;
            moves++;
         }
       }

       if (moves % 2 != 0) return "BOB";
       else return "ANDY";
    }    

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 5, 4, 1));  // 2,3,5,4,1  - Bob   // 5,2,6,3,4 - andy 

        System.out.println(gamingArray(arr));
    }
    
}