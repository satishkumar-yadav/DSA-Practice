/*
345

*/

import java.util.ArrayList;

public class ReverseVowelOfString {
    public static String reverseVowels(String s) {
       StringBuilder sb = new StringBuilder(s); 
       String vowels = "AEIOUaeiou";
       int n = s.length();
       ArrayList<Integer> ls = new ArrayList<>();
      // int []ind = new int[n];
      // int count=0;

       for(int i=0; i<n;i++){
          char c = s.charAt(i);
          if(vowels.contains(c+"")) ls.add(i); //ind[count++] = i;
       }

       int l=0;
       int r=ls.size();
       for (int i : ls) {
         sb.setCharAt(i, s.charAt(r));
         sb.setCharAt(r, s.charAt(i));
         l++;
         r--;
       }

       
        // while(l<r){
        //     sb.setCharAt(ls.get(), s.charAt(r));
        //     sb.setCharAt(r, s.charAt(l));
        //   l++;
        //   r--;
        // }

       return sb.toString();
    }

    public static void main(String[] args) {
       String s = "IceCreAm";
      // String s = "leetcode";

       System.out.println(reverseVowels(s));
    }
}
