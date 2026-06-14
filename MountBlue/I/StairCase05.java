
/*
05

Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the  function with the following parameter(s):

: an integer
Print

Print a staircase as described above. No value should be returned.
Note: The last line is not preceded by spaces. All lines are right-aligned.

Input Format

A single integer, , denoting the size of the staircase.

Constraints

 .

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .

*/

import java.io.IOException;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        int st = 1, sp = n - st;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("#");
            }
            sp--;
            st++;
            System.out.println();
        }

    }

}


public class StairCase05 {
    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        int n =2;
        Result.staircase(n);

        //bufferedReader.close();
    }
}
