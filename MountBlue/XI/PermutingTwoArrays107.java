/*
06-July-26
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PermutingTwoArrays107 {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
      //Sort A in ascending order
      Collections.sort(A);

      //Sort B in descending order
      Collections.sort(B, new Comparator<Integer>() {
         @Override
         public int compare(Integer i1, Integer i2){
            return i2.compareTo(i1);
         }
      });

      //Verifying relation for every pair greedily
      for (int i = 0; i < A.size(); i++) {
        if(A.get(i)+B.get(i)<k) return "NO";
      }

      return "YES";
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(0,1);
        List<Integer> B = Arrays.asList(0,2);
        int k = 1;

        System.out.println(twoArrays(k, A, B));

    }
    
}