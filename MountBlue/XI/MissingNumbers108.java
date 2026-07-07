/*
06-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers108 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
     // since max(brr)-min(brr) <= 100, instead of using overhead-heavy HashMap to count freq 
     // map all freq instantly into a tiny primitive array of size 1000 (safely catches any offset variation upto 100)      
     //find a pivot baseline to handle numbers safely via flat indices
     //using an offset ensures we can handle numbers upto 10^5 without giant array
     int baseline = brr.get(0)-500;
     int []freq = new int[1001];
     for (Integer num : brr) freq[num-baseline]++;

     //subtract freq present in arr
     for (Integer num : arr) freq[num-baseline]--;

     List<Integer> misingList = new ArrayList<>();

     //any position with a remaining count>0 is missing element
     for (int i = 0; i < freq.length; i++) if(freq[i]>0) misingList.add(i+baseline);
        
       return misingList;
    }
    
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
        List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);  // [4,6]

        System.out.println(missingNumbers(arr, brr));
    }
}