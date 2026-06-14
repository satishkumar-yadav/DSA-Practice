
/*
08
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

Example


There are two numbers between the arrays:  and .
, ,  and  for the first value.
,  and ,  for the second value. Return .

Function Description

Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.

getTotalX has the following parameter(s):

int a[n]: an array of integers
int b[m]: an array of integers
Returns

int: the number of integers that are between the sets
Input Format

The first line contains two space-separated integers,  and , the number of elements in arrays  and .
The second line contains  distinct space-separated integers  where .
The third line contains  distinct space-separated integers  where .

Constraints

Sample Input

2 3
2 4
16 32 96
Sample Output

3
Explanation

2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.

4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.


*/

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY a
     * 2. INTEGER_ARRAY b
     */

    //gpt sol
    public static int getTotalX2(List<Integer> a, List<Integer> b) {
     //sort naturally to find bounds
     Collections.sort(a);
     Collections.sort(b);

     int minBoundary = a.get(a.size()-1); // largest element in a
     int maxBoundary = b.get(0);  // smallest element in b
     int count =0;

     for (int num = minBoundary; num <= maxBoundary; num++) {
        boolean isValid = true;

        //condition 1: all elements in a must be factor of num
        for (int elementA : a) {
            if(num % elementA != 0){
                isValid = false;
                break;
            }
        }

        //condition 2 num must be factor of all elements in b
        if (isValid) {
            for (int elementB : b) {
                if(elementB % num !=0){
                    isValid = false;
                    break;
                }
            }
        }

        // if both condition satisfied, count it
        if (isValid)
            count++;
     }

      return count;

    }     

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        a.sort(Comparator.reverseOrder());  // descending order  // comparator supported only in java 8
        b.sort(Comparator.naturalOrder());  // ascending order
        //Collections.sort(a); // ascending order
        Collections.sort(a,Collections.reverseOrder());  // for java 7
        Collections.sort(b);
        ArrayList<Integer> ls = new ArrayList<>();
        int i = 1;
       // int j=0;
      // while ((a.get(j) * i) <= b.get(0)) {

        while((a.get(0)*i)<=b.get(0)){
            boolean flag = true;
            for (int k = 1; k < a.size(); k++) {
            if(((a.get(0)*i)%a.get(k))!=0) {
               flag =false;
               i++;
               break;
              }
            }
            if(flag) {
                ls.add(a.get(0) * i);
                i++;}
        }

        int count =0;

        for (Integer n : ls) {
            boolean flag =true;
            for (Integer m : b) {
                if(m%n!=0) flag=false;
            }
            if(flag) count++;
        }

        return count;
    }

}


public class BetweenTwoSets08 {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int n = Integer.parseInt(firstMultipleInput[0]);

        // int m = Integer.parseInt(firstMultipleInput[1]);

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n=2;
        int []arrTemp = {2,4};
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //int arrItem = Integer.parseInt(arrTemp[i]);
           // arr.add(arrItem);
           arr.add(arrTemp[i]);
        }

        int m = 3;
       // String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int brrTemp[] = {16,32,96} ;

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
           // int brrItem = Integer.parseInt(brrTemp[i]);
           // brr.add(brrItem);
           brr.add(brrTemp[i]);
        }

        int total = Result.getTotalX(arr, brr);

        System.out.println(total);

        // bufferedWriter.write(String.valueOf(total));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}