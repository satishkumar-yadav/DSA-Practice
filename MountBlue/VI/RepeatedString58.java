/*
 23-Jun-26
 */

 public class RepeatedString58 {
 
     public static long repeatedString(String s, long n) {
           int strLen = s.length();

           //counting 'a's in a single full instance of string
           long aInSingleStr=0;
           for (int i = 0; i < strLen; i++) if(s.charAt(i)=='a') aInSingleStr++;
           
           //determine full blocks and the remaining partial segment length
           long fullBlocks = n/strLen;
           long remainderLength = n % strLen;

           //Accumulating total count from complete recurring blocks
           long totalCount = fullBlocks * aInSingleStr;

           //calculating 'a' occurences in final partial block segment
           for (int i = 0; i < remainderLength; i++) if(s.charAt(i)=='a') totalCount++;
           
           return totalCount;
           
     }

     public static void main(String[] args) {
         String s = "aba"; //a
         long n = 10;  //7
        // long n = 1000000000000L;  //ans same

         System.out.println(repeatedString(s, n));
     }
 }