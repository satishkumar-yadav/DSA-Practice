/*
Easy
171: Excel Sheet Column Number
01-July-26

Constraints :
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 

*/

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // Convert letter to number
            result = result * 26 + value;
        }
        return result;
    }


    public static void main(String[] args) {
        //String columnTitle = "A"; // 1
        // String columnTitle = "AB"; // 28
         String columnTitle = "ZY"; // 701

        System.out.println(titleToNumber(columnTitle));
    }
}
