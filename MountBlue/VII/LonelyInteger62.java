/*

27-Jun-26

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LonelyInteger62 {
    public static int lonelyinteger2(List<Integer> a) {
       HashMap<Integer,Integer> hm = new HashMap<>();

       //frequency counting M-I
       for (int i = 0; i < a.size(); i++) {
          int count = 1;
          if(!hm.containsKey(a.get(i))) hm.put(a.get(i), count);
          else if(hm.containsKey(a.get(i))) {
              count = hm.get(a.get(i));
              hm.put(a.get(i), count+1);
          }
       }
       
       // frequency counting M-II
       //getOrDefault: get the current count of element or 0 if its not, add 1 to it and put it back
      // for (int i = 0; i < a.size(); i++) hm.put(a.get(i), hm.getOrDefault(a.get(i),0)+1);   

       //Printing M-I
    //    for (Map.Entry<Integer,Integer> entry : hm.entrySet())  System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
    
       // Printing M-II
      // System.out.println(hm);

       // Printing M-III : Modern Java Way(ForEach Lambda)
      // hm.forEach((key,value) -> System.out.println(key+": "+value));

       for (Map.Entry<Integer,Integer> entry : hm.entrySet()) if(entry.getValue()==1) return entry.getKey();

       return -1;
    }

    // optimised sol : since every number appears exactly twice except for 1 unique element,there is no need of 
    // HashMap (which takes O(N) extra space) , can be solved in O(1) space using XOR(^) operator !
    // Because X^X=0 and X^0=x , XORing all numbers together cancels out all duplicates and leaves only unique number 
    public static int lonelyinteger(List<Integer> a) {
      int res=0;
      for (int num : a) {
        res ^= num;
      }
      return res;
    }    

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,3,2,1);

        System.out.println(lonelyinteger(a));
        System.out.println("2: "+lonelyinteger2(a));
    }
    
}