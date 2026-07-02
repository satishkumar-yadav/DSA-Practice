/*
01-July-26
*/

class FunnyString72 {
    public static String funnyString(String s) {
        int i=0 , j=s.length()-1;
        while (i<s.length()-1 && j>0) {
            int a = Math.abs(s.charAt(i)-s.charAt(i+1));
            int b = Math.abs(s.charAt(j) - s.charAt(j - 1));
            if(a!=b) return "Not Funny";
            i++;
            j--;
        }

        return "Funny";
    }
    
    public static void main(String[] args) {
        String s="bcxz";

       // System.out.println('a'+0);
        System.out.println(funnyString(s));
    }
}