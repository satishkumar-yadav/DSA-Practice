/*


*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MaximumPerimeterTriangle51 {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
         Collections.sort(sticks);
         int n= sticks.size();
         List<Integer> res = new ArrayList<>();

         //iterating backward from largest element to maximise perimeter eagerly
         for (int i = n-1; i >= 2; i--) {
            int c= sticks.get(i);  // longest side of triplet
            int b= sticks.get(i-1); //Middle side
            int a = sticks.get(i-2);  // shortest side

            // checking non-degenerating triangle inequality
            if(a+b>c){
                res.add(a);
                res.add(b);
                res.add(c);
                return res;
            }
         }

         //if no-triplet can satisfy condition
         res.add(-1);
         return res;
    }

    public static void main(String[] args) {
         List<Integer> ls = Arrays.asList(1,2,3,4,5,10);
         
         System.out.println(maximumPerimeterTriangle(ls));
    }
}