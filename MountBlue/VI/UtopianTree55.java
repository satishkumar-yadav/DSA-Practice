/*

22-Jun-26

*/

class UtopianTree55 {

    public static int utopianTree(int n) {
        int h=1;

        for (int i = 1; i <= n; i++) {
            if(i==1) h++;
            else if(i%2==0)  h += 1;
            else  h *= 2;
        }

        return h;
    }

    public static void main(String[] args) {
        int n = 60;

        System.out.println(utopianTree(n));
    }

}