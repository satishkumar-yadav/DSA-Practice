/*
Medium
1291: Sequential Digits
13-July-26

Constraints:
10 <= low <= high <= 10^9

Example 1:
Input: low = 100, high = 300
Output: [123,234]

Example 2:
Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

This method uses logarithms to determine the number of digits in the integer, then uses division to isolate the first digit. It is concise but relies on understanding logarithmic properties.

Logic:
- For a non-zero integer num, the number of digits d is given by floor(log10(|num|)) + 1.
- The first digit is then |num| / 10^(d-1) (integer division).

*/

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    // Using logarithmic calculations
    public static int getFirstDigitLogarithmic(int num) {
        if (num == 0) {
            return 0;
        }

        // Convert to positive and cast to double for log10
        double absNum = Math.abs(num);

        // Calculate number of digits: floor(log10(absNum)) + 1
        int digits = (int) Math.floor(Math.log10(absNum)) + 1;

        // Isolate the first digit: absNum / 10^(digits - 1)
        double firstDigitDouble = absNum / Math.pow(10, digits - 1);

        // Convert to integer (truncates decimal part)
        return (int) firstDigitDouble;
      //  return (int) Math.floor(num / Math.pow(10, Math.floor(Math.log10(num))));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
       List<Integer> res = new ArrayList<>();

    //    int lowLength = (int) Math.floor(Math.log10(low)) + 1;
    //    int highLength = (int) Math.floor(Math.log10(high)) + 1;
    //    int firstDigit = (int) (low / Math.pow(10, lowLength - 1));
    //    System.out.println(firstDigit +" : "+lowLength+", "+highLength);
    
        String digits = "123456789";
        
        // Length of numbers we want to generate
        for (int len = String.valueOf(low).length(); len <= String.valueOf(high).length(); len++) {
            // Sliding window of size 'len' over "123456789"
            for (int i = 0; i + len <= 9; i++) {
                int num = Integer.parseInt(digits.substring(i, i + len));
                if (num >= low && num <= high) {
                    res.add(num);
                }
            }
        }

       return res;
    }

    public static void main(String[] args) {
        int low = 1000;
        int high = 13000;

        System.out.println(sequentialDigits(low, high));
    }
}
