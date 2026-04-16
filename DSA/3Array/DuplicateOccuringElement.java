/*
Print Duplicate Occuring Element

i/p: [1,1,2,2,3,3]
o/p: 1,2,3 

*/

public class DuplicateOccuringElement {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 8, 8, 9, 10 };
       
        for (int i = 0; i < a.length-1; i++) {
            int count =0;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if(count>0 && a[i]!=-1) System.out.print(a[i]+" ");
        }
    }
}
