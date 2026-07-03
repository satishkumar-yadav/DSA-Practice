/*
02-July-26

Note: You can modify only one line in the given code and you cannot add or remove any new lines.
*/

import java.util.Scanner;

public class SmartNumber78 {
   //original code
    // public static boolean isSmartNumber(int num) {
    //     int val = (int) Math.sqrt(num);
    //     if (num / val == 1)
    //         return true;
    //     return false;
    // }

    // debug  - smart number is basically a perfect square
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if (val * val == num)   // num / val == val  - this fails
            return true;
        return false;
    }

    public static void main(String[] args) {
         int test_cases;   //4
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;   // 1-Yes,  2-No,  7-No,  169-Yes
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}