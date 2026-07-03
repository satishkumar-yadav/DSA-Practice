/*
02-July-26

Constraints:
1<= |s| <10^4
*/

import java.util.HashMap;
import java.util.Map;

class Anagram81 {

    //efficient gemni sol
    public static int anagram2(String s) {
        int n = s.length();

        //if string length is odd, we can't split it into two equal halves
        if (n % 2 != 0) return -1;

        //split strings into two equal halves conceptually
        int mid = n / 2;

        //frequency array for 26 English lowercase letters
        int[] charCount = new int[26];

        //increment freq for char in first half
        for (int i = 0; i < mid; i++) charCount[s.charAt(i)-'a']++;
        
        // decrement freq for char in second half
        for (int i = mid; i < n; i++) charCount[s.charAt(i) - 'a']--;
        
        // Total no of changes neede is equal to either : sum of all +ve values in charCounts
        // or sum of all -ve values in charCounts (absolute)
        int changesNeeded=0;
        for (int count : charCount) if(count>0) changesNeeded += count;
            
        return changesNeeded;
    }   

    //self passes all test cases
    public static int anagram(String s) {
        int n = s.length();
        if(n%2 != 0) return -1;

        int mid = n/2;
        String s1 = s.substring(0,mid);
        String s2 = s.substring(mid,n);
       // System.out.println("s1: "+s1+", s2: "+s2);
        
        Map<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!hm.containsKey(c)) hm.put(c, 1);
            else {
                int val = hm.get(c);
                hm.put(c,val+1);
            }
        }
       // System.out.println(hm);

        for(int j=0; j<s2.length();j++){
            char c = s2.charAt(j);
            if (hm.containsKey(c)){
                int val = hm.get(c);
                int sub = (val-1)<0 ? 0: val-1;
                hm.put(c, sub);
            }
        }
       // System.out.println(hm);

        int count = 0;
        for (int val : hm.values()) count += val;

        // for(Map.Entry<Character,Integer> entry : hm.entrySet()){
        //     Integer val = entry.getValue();
        //     count += val;
        // }

        return count;
    }

    public static void main(String[] args) {
        String s= "aaabbb"; //3
       // String s= "ab";     //1
       // String s= "abc";    //-1
       // String s= "mnop";   //2
       // String s= "xyyx";   //0
       // String s= "xaxbbbxx"; //1
       // String s= "abccde";  //2
       // String s= "acccde";  //2

        System.out.println(anagram(s));
    }
    
}