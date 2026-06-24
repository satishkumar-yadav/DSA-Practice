/*
 23-Jun-26
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers57 {

    //for numbers>100
    public static int pickingNumbers2(List<Integer> a) {
       Map<Integer,Integer> freqMap = new HashMap<>();

       //populating freqMap
       for (Integer num : a) {
          int count = freqMap.containsKey(num) ? freqMap.get(num)+1 : 1;
          freqMap.put(num, count);
       }

       int maxLength=0;
       //evaluating pairs dynamically based on keys present in the map
       for (Integer key : freqMap.keySet()) {
          int curCount = freqMap.get(key);
          int nextCount = freqMap.containsKey(key+1) ? freqMap.get(key+1) : 0;
          int total = curCount + nextCount;
          if(total>maxLength) maxLength=total;
       }

       return maxLength;
    }   

    public static int pickingNumbers(List<Integer> a) {
         int maxLen=0;
         int []freq = new int[101];   // numbers from 0-100

         //counting freq
         for (Integer num : a) freq[num]++;

         //finding maximum combination of consecutive numbers(i and i+1) , look upto 99 (checking freq[i]+freq[i+1])
         for (int i = 1; i < 100; i++) {
            int curLength = freq[i]+freq[i+1];
            if(curLength>maxLen) maxLen=curLength;
         } 

        return maxLen;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,1,2,2,3,3,4,4,5,5,5);

        System.out.println(pickingNumbers(a));
    }
    
 }