/*
28 - Index of first occurence of string

*/

public class IndexOfFirstOccurenceInString {
    public static int strStr(String haystack, String needle) {
         int m = haystack.length() , n= needle.length();

         //if needle is longer than haystack
         if(m<n) return -1;

         //looping to where needle can still fit
         for (int i = 0; i <= m-n; i++) {
            int j;
            // checking character by character matching
            for(j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;  // mismatch found , break internal loop
            }

            // if loop finished without breaking, found full match
            if(j==n) return i;
         }

         return -1;
    }

    public static void main(String[] args) {
       String haystack = "sadbutsad", needle = "sad";

       System.out.println(strStr(haystack, needle));
    }
}
