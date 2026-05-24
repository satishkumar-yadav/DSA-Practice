
/*
09

Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

Example.


aab shortens to b in one operation: remove the adjacent a characters.


Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

Function Description

Complete the superReducedString function in the editor below.

superReducedString has the following parameter(s):

string s: a string to reduce
Returns

string: the reduced string or Empty String
Input Format

A single string, .

Constraints

Sample Input 0

aaabccddd
Sample Output 0

abd
Explanation 0

Perform the following sequence of operations to get the final string:

aaabccddd → abccddd → abddd → abd
Sample Input 1

aa
Sample Output 1

Empty String
Explanation 1

aa → Empty String
Sample Input 2

baab
Sample Output 2

Empty String
Explanation 2

baab → bb → Empty String

*/

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

import java.io.IOException;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    //optimised solution
    public static String superReducedString2(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int lastIndex = sb.length()-1;

            //if currentChar matches last added char, means duplicate pair found pop/remove it
            if(sb.length()>0 && sb.charAt(lastIndex)==currentChar) sb.deleteCharAt(lastIndex);
            else sb.append(currentChar);  // add to sb if no duplicate(push)
        }

        return sb.length()==0 ? "Empty String" : sb.toString();
    }     

    public static String superReducedString(String s) {
        int i=0;

        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                StringBuilder sb = new StringBuilder(s);
                sb.delete(i, i+2);
                s=sb.toString();
              // s=s.replace(s.charAt(i)+"", "");  // replaces all occurences of char
              // s=s.replace(s.charAt(i)+"", "");
               i= Math.max(0, i-1);  // i=0;
            }
            else i++;  // no match move to next char
        }

        return s.isEmpty() ? "Empty String" : s;
    }

}


public class SuperReducedString09 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = bufferedReader.readLine();

       // String s = "baabc";
        String s = "aaabccddd";
       // String s = "baab";
       // String s = "aa";
       // String s = "abdfgdfhhhggtttt";
       //String s ="";
       //String s = "s";

        String result = Result.superReducedString(s);
        String result2 = Result.superReducedString2(s);

        System.out.println(result);
        System.out.println("optimised: "+result2);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
