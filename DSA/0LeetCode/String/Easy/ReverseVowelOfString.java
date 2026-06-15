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

       for(int i=0; i<n;i++){
          char c = s.charAt(i);
          if(vowels.contains(c+"")) ls.add(i);  
       }

       int l=0;
       int r=ls.size()-1;
        while(l<r){
            int temp = ls.get(l);   
            sb.setCharAt(ls.get(l), s.charAt(ls.get(r)));
            sb.setCharAt(ls.get(r), s.charAt(temp));
          l++;
          r--;
        }

       return sb.toString();
    }

    public static void main(String[] args) {
      // String s = "IceCreAm";
       String s = "leetcode";

       System.out.println(reverseVowels(s));
    }
}
