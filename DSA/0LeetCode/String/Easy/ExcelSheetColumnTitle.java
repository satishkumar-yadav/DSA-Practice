/*
Easy
168: Excel Sheet Column Title
01-July-26

Constraints :
1 <= columnNumber <= 2^31 - 1

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 

*/

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // adjust for 1-indexed
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        //int columnNumber = 1;  // "A"
        //int columnNumber = 28;  // "AB"
        int columnNumber = 701;  // "ZY"

        System.out.println(convertToTitle(columnNumber));
    }
}
