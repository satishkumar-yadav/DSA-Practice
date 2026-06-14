/*
9-6-26
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarcCakewalk36 {
    public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie);
      long totalMiles=0;
      int n=calorie.size();
      
      //iterating backward to process fromm largest to smallest
      // i- track position in list, j- track exponent count (0,1,2)
      int j=0;
      for(int i=n-1;i>=0;i--){
        int cal= calorie.get(i);
        totalMiles += (long) cal*Math.pow(2, j);
        j++;
      }
      return totalMiles;
    }

    public static void main(String[] args) {
        int []arr = {5,10,7};
        List<Integer> ls = new ArrayList<>();

        for (int n : arr) {
            ls.add(n);
        }

        System.out.println(marcsCakewalk(ls));

    }
}
