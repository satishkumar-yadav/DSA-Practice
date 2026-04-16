/*
a: [1,3,4,5]
b: [2,4,3,1]

o/p: 1,3,4 

*/
public class CommonElementInTwoArray {
    public static void commonElement(int a[],int b[]){
        int m = (a.length>b.length) ? a.length : b.length;
        int n = (a.length < b.length) ? a.length : b.length;
        for (int i = 0; i < m; i++) {
            boolean flag=false;
            for (int j = 0; j < n; j++) {
                if(a[i]==b[j]) {
                    flag = true;
                    break;
                }
            } 
            if(flag) System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 5, 6,8, 9, 1,4 };
        int b[] = { 2, 4, 3, 1 };

        commonElement(a, b);
    }
}
