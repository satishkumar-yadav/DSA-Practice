
/*
a: [1,3,4,5]
b: [2,4,3,1]

o/p: 1,3,4 

*/
  
public class CommonElementInTwoArray {

    static void commonElement(int[]a, int[]b){
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]) {
                    flag=true;
                    break;
                }
            }
            if(flag) System.out.print(a[i]+" ");
        }        
    }
    public static void main(String[] args) {
        int a[] = {1,3,4,5};
        int b[] = {2,4,3,1};

        commonElement(a,b);
    }
    
} 