import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray46 {
    public static int equalizeArray(List<Integer> arr) {
       //Fixed size constraint/freq array - if values are between 1 & 100
       int[] count = new int[101];
       int maxFreq =0;

       for (Integer num : arr) {
           count[num]++;
           if(count[num]>maxFreq) maxFreq=count[num];
       }

       return arr.size()-maxFreq;
    }

    public static int equalizeArray2(List<Integer> arr) {
       //using freq Map(HashMap)
       Map<Integer,Integer> freqMap = new HashMap<>();
       int maxFreq=0;
       int totalElements=arr.size();

       //one pass freq calculation
       for (Integer num : arr) {
          int currCount=1;

          //checking if num already in map
          if(freqMap.containsKey(num)) currCount=freqMap.get(num)+1;

          //updating map with new count
          freqMap.put(num, currCount);

          //Tracking highest freq found so far
          if(currCount>maxFreq) maxFreq=currCount;
       }

       return totalElements-maxFreq;
    }

    public static void main(String[] args) {
         //List<Integer> arr = Arrays.asList(3,3,2,1,3);
         //List<Integer> arr = Arrays.asList(1,2,2,3);
         List<Integer> arr = Arrays.asList(1,2,3,4);
         
         System.out.println(equalizeArray(arr));
    }
}
