import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances47 {
    public static int minimumDistances(List<Integer> a) {
       // Map stores - key:Element Value, value:Its latest index position
       Map<Integer,Integer> indexMap = new HashMap<>();
       int minDistance = Integer.MAX_VALUE;
       int n= a.size();

       for (int i = 0; i < n; i++) {
          int currElement = a.get(i);
          //if currElement is seen before or present in map, cal dist
          if(indexMap.containsKey(currElement)){
            int prevIndex = indexMap.get(currElement);
            int currDistance = i-prevIndex;

            //Tracking the smallest dist found so far
            if(currDistance<minDistance) minDistance=currDistance;
          }

          //updating map with latest index of element
          indexMap.put(currElement, i);
       }

       //if minDistance was never updated, no pair found
        return (minDistance==Integer.MAX_VALUE) ? -1 : minDistance;

    } 
    
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3,2,1,3,2);

        System.out.println(minimumDistances(a));
    }
}
