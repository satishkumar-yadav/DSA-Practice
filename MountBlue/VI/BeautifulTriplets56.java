/*
 
 22-Jun-26
 
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class BeautifulTriplets56 {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count=0;
        HashSet<Integer> set = new HashSet<>(arr);
        
        //treating each num as potential starting element 'x' of a triplet
        for (int num : arr) if(set.contains(num+d) && set.contains(num+(2*d))) count++;

        return count;
    }

    public static void main(String[] args) {
        int d =1;
        List<Integer> arr = Arrays.asList(2,2,3,4,5);

        System.out.println(beautifulTriplets(d, arr));
    }
} 