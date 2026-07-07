/*
06-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers102 {
   public static List<Integer> closestNumbers(List<Integer> arr) {
       List<Integer> res = new ArrayList<>();
       int min = Integer.MAX_VALUE;
       Collections.sort(arr);

       for (int i = 0; i < arr.size()-1; i++) {
          int diff = Math.abs(arr.get(i+1)-arr.get(i));
          if(diff==min){res.add(arr.get(i));  res.add(arr.get(i+1));}
          else if(diff<min){
            res.removeAll(res);
            res.add(arr.get(i));
            res.add(arr.get(i+1));
            min = diff;
          }
       }

       return res;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 4, 3, 2);
        // 1,5,8,10,12,14,15,16  -  (14,15),(15,16)
        // 5,2,3,4,1    - (1,2),(2,3),(3,4),(4,5)
        // 5,4,3,2   -  (2,3),(3,4),(4,5)
        // 

        System.out.println(closestNumbers(arr));
    }
    
}