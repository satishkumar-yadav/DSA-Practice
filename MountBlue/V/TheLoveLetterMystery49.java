import java.util.Arrays;

public class TheLoveLetterMystery49 {

    public static int theLoveLetterMystery2(String s) {
        int opCount=0;
        char []a = s.toCharArray();
        int l=0;
        int r=a.length-1;

        while (l<r) {
            int i = (a[l]<a[r]) ? l : r;
            int j = (a[l]>a[r]) ? l : r;
            while(a[i]!=a[j] || a[j]!='a'){
                a[j]--;
                opCount++;
            }
            l++;
            r--;
        }
     
        System.out.println(Arrays.toString(a));
        return opCount;
    }

    public static int theLoveLetterMystery(String s) {
        int opCount = 0;
        int l = 0;
        int r = s.length() - 1;

        while (l<r) {
            opCount += Math.abs(s.charAt(l)-s.charAt(r));
            l++;
            r--;
        }
       return opCount;
    }

    public static void main(String[] args) {
        String s = "cde";

        System.out.println(theLoveLetterMystery(s));
    }
}