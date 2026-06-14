/*
9-6-26
*/

public class JumpingOnTheCloudsRevisited34 {
    static int jumpingOnClouds(int[] c, int k) {
        int e=100, n=c.length, i=0, p=c[i];
        while (true) {
            i = (i+k)%n;
            p=c[i];
            e--;
            if(p==1) e -=2;
            if(i==0) break;
        }
        return e;
    }

    public static void main(String[] args) {
        //int []c = {0,0,1,0};
        int[] c = { 0,0,1,0,0,1,1,0};
        int k=2;

        System.out.println(jumpingOnClouds(c, k));
    }
}
