/*
02

Given an array of integers, find the sum of its elements.

For example, if the array ar=[1,2,3],1+2+3=6 , so return 6.

Function Description

Complete the simpleArraySum function with the following parameter(s):

ar[n]: an array of integers

Returns
int : the sum of the array elements

Input Format

The first line contains an integer, n, denoting the size of the array.
The second line contains n space-separated integers representing the array's elements.

Constraints
0<n,ar[i]<=1000


Sample Input

STDIN           Function
-----           --------
6               ar[] size n = 6
1 2 3 4 10 11   ar = [1, 2, 3, 4, 10, 11]

Sample Output
31

Explanation

Print the sum of the array's elements: 1+2+3+4+10+11=31.


*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Result {
    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int n : ar) {
            sum += n;
        }
        return sum;
    }
}


public class SimpleArraySum02 {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int arCount = Integer.parseInt(bufferedReader.readLine().trim());

       // String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");


        int arCount = 6;
        int arr[] = { 1,2,4,6,10,11 };
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
           // int arItem = Integer.parseInt(arTemp[i]);
            //ar.add(arItem);
            ar.add(arr[i]);
        }

        int result = Result.simpleArraySum(ar);

        System.out.println(result);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedReader.close();
       // bufferedWriter.close();
    }
}
