/*
05-July-26
*/

import java.util.Arrays;
import java.util.List;

public class IntroToTutorialChallenges97 {
    public static int introTutorial(int V, List<Integer> arr) {
     int st=0;
     int end=arr.size()-1;
     while (st<=end) {
        int  mid=st+end-1/2;
        if(arr.get(mid)==V) return mid;
        else if(arr.get(mid)>V) end=mid-1;
        else st=mid+1;
     } 
      return -1;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 4, 5, 7, 9, 12);
        int v = 4;  //1

        System.out.println(introTutorial(v, arr));
    }
    
}