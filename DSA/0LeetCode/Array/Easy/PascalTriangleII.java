
/*
119

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

*/

import java.util.ArrayList;
import java.util.List;

class PascalTriangleII{
     public static List<Integer> getRow(int rowIndex) {
        int [][] a= new int[rowIndex+1][];
        for(int i=0; i<=rowIndex; i++){
            a[i]=new int [i+1];
           for(int j=0; j<a[i].length; j++){
            if(j==0 || i==j) a[i][j]=1;
            else a[i][j] = a[i-1][j-1]+a[i-1][j];
           }
        }

        List<Integer> ls= new ArrayList<>();
        for(int k=0; k<a[rowIndex].length; k++) ls.add(a[rowIndex][k]);

        return ls;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        //int[][] a = new int[rowIndex + 1][];

        List<Integer> res = getRow(rowIndex);

        //System.out.println(Arrays.deepToString(getRow(rowIndex)));

        System.out.println(res);
    }
}