/*
  30-Jun-26
*/

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds66 {

     public static int jumpingOnClouds(List<Integer> c) {
      int jump =0;
      int pos= 0;
      int n=c.size();

      while (pos<n-1) {
        if(pos+2<n && c.get(pos+2)==0) pos += 2; 
        else pos += 1;
        jump++;    
      }
    
      return jump;
    }

    public static void main(String[] args) {
        List<Integer> c = Arrays.asList(0, 0, 0, 1, 0, 0);
        // 0,1,0,0,0,1,0     - 3
        // 0,0,1,0,0,1,0     - 4
        // 0,0,0,0,1,0       - 3
        // 0,0,0,1,0,0       -3

        System.out.println(jumpingOnClouds(c));
    }
}