/*
03-July-26

  Core Palindrome rule:
    - In an even-length palindrome, every single characters must appear an even number of times.
    - In an odd-length palindrome, exactly 1 character can appear odd number of times, while all other must appear even number of times.

    Simplified goal:
      - count the freq of all characters, if no of char with odd freq is >1, it is impossible to form palindrome
*/

public class GameOfThrones_I85 {
    public static String gameOfThrones(String s) {
        int []freq = new int[26];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)-'a']++;

        int oddFreqCount=0;
        for (int count : freq) if(count % 2 != 0) oddFreqCount++;
            
        //if more than 1 char has odd freq, a palindrome is impossible
        if(oddFreqCount>1) return "NO";
        else return "YES";
    }
    
    public static void main(String[] args) {
        String s = "aabbccdd";

        System.out.println(gameOfThrones(s));
    }
}