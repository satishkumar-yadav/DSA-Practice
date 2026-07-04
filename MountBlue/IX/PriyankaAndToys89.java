/*
03-July-26
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriyankaAndToys89 {
    // passes 
     public static int toys(List<Integer> w) {
       int container = 1;
       Collections.sort(w);

       int first = w.get(0);
       for (int n : w) {
           if(n>first+4) {container++; first=n; }
       }

       return container;
    }

    public static void main(String[] args) {
        // 1 2 3 21 7 12 14 21   // 4
        //1 2 3 4 5  10 11 12 13    //2

        List<Integer> w = Arrays.asList(1,2,3,21,7,12,14,21);

        System.out.println(toys(w));

    }
    
}