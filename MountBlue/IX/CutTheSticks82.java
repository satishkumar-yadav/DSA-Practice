/*
02-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks82 {
    // out of bounds error
    public static List<Integer> cutTheSticks2(List<Integer> arr) {
       List<Integer> res = new ArrayList<>();

       // while (!arr.isEmpty()) {
       while (true) {
         int stickCut = arr.size();
         res.add(stickCut);
        // if(stickCut==1) break;
        if(arr.isEmpty()) break;
         Collections.sort(arr);
         int cutLen = arr.get(0);
         for(int i=0; i<stickCut;){
            int cut = arr.get(i)- cutLen;
            if(cut<=0) arr.remove(i);
            else{
                arr.set(i, cut);
                i++;
            }
         }
        //  for (int i = 0; i < stickCut; i++) {
        //     int a = arr.get(i);
        //     int cut = a-cutLen;
        //     if(cut<=0) arr.remove(i);
        //     else{
        //         arr.set(i, cut);
        //     }
        //  }
       }

       return res;
    }

    //gemni optimise sol
    public static List<Integer> cutTheSticks(List<Integer> arr) {
       //convert list to a basic primitive array or object for clean sorting
       int n = arr.size();
       int[] sticks = new int[n];
       for(int i=0; i<n; i++) sticks[i] = arr.get(i);

       //Sorting array in ascending order
       Arrays.sort(sticks);

       List<Integer> res = new ArrayList<>();
       res.add(n);  // first iteration will always cut all 'n' sticks

       //traversing through sorted sticks
       for (int i = 1; i < n; i++) {
         //a change in value means we've hit a new "shortest stick" tier
         if(sticks[i] != sticks[i-1]){
            // no of sticks left to cut is remaining elements from index
            res.add(n-i);
         }
       }

       return res;
    }    

    public static void main(String[] args) {
       // List<Integer> arr = Arrays.asList(5,4,4,2,2,8);
       // Arrays.asList() returns a fixed-size list , we can't add or remove element from it

       List<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8));  // modifiable ArrayList

        System.out.println(cutTheSticks(arr));
    }
    
}