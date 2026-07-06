/*
05-July-26
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MarkAndToys101 {
    public static int maximumToys(List<Integer> prices, int k) {
      Collections.sort(prices);

      int toyCount = 0;
      int remBudget = k;

      //Greedily buy cheapest toy first
      for (Integer price : prices) {
         if(remBudget>=price){
            remBudget -= price;
            toyCount++;
         }
         else break;  // since array is sorted, all upcoming toys will be even more expensive 
      }

      return toyCount;
    }

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(1,2,3,4);
        int k = 7;

        System.out.println(maximumToys(prices, k));
    }
    
}