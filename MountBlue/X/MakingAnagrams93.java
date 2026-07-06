/*
05-July-26
*/

public class MakingAnagrams93 {
    //passes
    public static int makingAnagrams(String s1, String s2) {
          int commonCount=0;  
          int freq[] = new int[26];

          for (int j = 0; j < s1.length(); j++) freq[s1.charAt(j)-'a']++;

          for (int i = 0; i < s2.length(); i++) {
             int indx = s2.charAt(i) - 'a';
             if (freq[indx] >0) { freq[indx]--; commonCount++; }
          }

          return (s1.length()+s2.length())-(2*commonCount) ;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cde";

        System.out.println(makingAnagrams(s1, s2));
    }
    
}