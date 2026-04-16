
/*
Print Duplicate Occuring Element

i/p: [1,1,2,2,3,3]
o/p: 1,2,3 

*/

public class DuplicateOccuringElement {
public static void main(String[] args) {
    int a[] = {1,1,2,2,3,3,4,4,5,6,7,8,8,8,9,10};
    int n= a.length;

    int visited = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
       if(a[i]==visited) continue;

       boolean foundDuplicate = false;
       for (int j = i+1; j < n; j++) {
           if(a[i]==a[j]){
            foundDuplicate=true;
            a[j]=visited;
           }
       }

       if(foundDuplicate) System.out.print(a[i]+" ");
    }
}
    
}