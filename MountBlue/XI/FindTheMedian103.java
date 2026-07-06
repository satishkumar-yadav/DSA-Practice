/*
05-July-26
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FindTheMedian103 {
 public static int findMedian(List<Integer> arr) {
      Collections.sort(arr);
      return arr.get(arr.size()/2);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0, 1, 2, 4, 6, 5, 3);   // 5,3,1,2,4 -3  // 0,1,2,4,6,5,3 - 3

        System.out.println(findMedian(arr));
    }
    
}