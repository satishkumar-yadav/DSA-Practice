/* 
01 

There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example
n=7
ar= [1,2,1,2,1,3,2]

There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

- Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

-int n: the number of socks in the pile
-int ar[n]: the colors of each sock

Returns

int: the number of pairs

Input Format

The first line contains an integer n, the number of socks represented in ar.
The second line contains n space-separated integers, ar[i], the colors of the socks in the pile.

Constraints
1<=n<=100
1<=ar[i]<=100 where 0<=i<n

Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output
3 (10-10, 10-10, 20-20)


*/

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch01 {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //  int n = Integer.parseInt(bufferedReader.readLine().trim());

        //String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

      //  Scanner sc = new Scanner(System.in);

      //  int n = sc.nextInt();
      int n =10;
      int arr[]= {1,1,3,1,2,1,3,3,3,3};

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //int arItem = Integer.parseInt(arTemp[i]);
            //ar.add(arItem);
           // ar.add(sc.nextInt());
           ar.add(arr[i]);
        }

        System.out.println(ar);

        int result = Solution.sockMerchant(n, ar);

        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }

   
}

class Solution {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER_ARRAY ar
     */

    public static int sockMerchant3(int n, List<Integer> ar) {
        // Set to keep track of unmatched socks
        Set<Integer> unmatchedSocks = new HashSet<Integer>();
        int totalPair=0;

        for (Integer currColor : ar) {
            //if already have sock of this color waiting for a match
            if(unmatchedSocks.contains(currColor)){
                totalPair++;
                unmatchedSocks.remove(currColor);
            }
            else{
                // otherwise put the socks into set to wait for its pair
                unmatchedSocks.add(currColor);
            }
        }
        return totalPair;
    }

    public static int sockMerchant2(int n, List<Integer> ar){
        // sort to make identical color adjacent
        Collections.sort(ar);

        int pair =0;
        int i=0;

        //comparing adjacent item
       while (i<n-1) {
          if(ar.get(i).equals(ar.get(i+1))){
            pair++;
            i+=2; // move past both paired socks
          }
          else i++;  // move to next sock
       }

       return pair;
    }

    public static int sockMerchant(int n, List<Integer> ar) {
         int pair = 0;

        int i = 0, j = i + 1;
        while (i < n-1 && j < n) {
           if(ar.get(i)<0) {
            i++;
            j=i+1;
            continue;
           }
            if (ar.get(i).equals(ar.get(j))) {
                pair++;
                ar.set(j,-ar.get(j));
                i++;
                j = i + 1;
                continue;
            }
             if(j==n-1){  //last element, increase i
                i++;
                j=i+1;
                 continue;
            }
            j++;
        }

        return pair;

    }
}