/*
07-July-26
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SherlockAndTheValidString121 {
    //buggy code
    public static String isValid3(String s) {
         int n = s.length();
         int[] freq = new int[26];
         for (int i = 0; i < n; i++) freq[s.charAt(i)-'a']++;

         int count =0;
         for (int i = 0; i < freq.length-1; i++) {
            if((freq[i] !=0) && (freq[i]==(freq[i+1]+1) || freq[i]==(freq[i+1]-1))) {
                if(count==1) return "NO";
                count++;
            }
            if ((freq[i] !=0) && (freq[i] != freq[i + 1]))  return "NO";
         }

         return "YES";
    }

    public static String isValid(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++)  freq[s.charAt(i) - 'a']++;

        //collect only active non-zero freq
        List<Integer> activeFreqs = new ArrayList<>();
        for (int f : freq) if(f>0) activeFreqs.add(f);

        Collections.sort(activeFreqs);  //sorting to compare min and max easily

        int totalLetters = activeFreqs.size();

        if(totalLetters <= 1) return "YES";  //if there's only 1 distinct letter character type, it's always valid

        int first = activeFreqs.get(0);
        int last = activeFreqs.get(totalLetters-1);

        //all freq are already perfectly equal
        if(first==last) return "YES";

        //absolute largest freq is exactly 1 higher than all rest, and happens only once
        if(last-first==1 && activeFreqs.get(totalLetters-2)==first) return "YES";

        //smallest freq is exactly 1, and all other freq are equal
        if(first==1 && activeFreqs.get(1)==last) return "YES";    
        
        return "NO";
    }    

    public static void main(String[] args) {
        String s = "abcc";  // valid  - abc , abcc , abcdefghhgfedecba  //inv - abccc , aabbcd , aabbccddeefghi

        System.out.println(isValid(s));
    }
    
}
