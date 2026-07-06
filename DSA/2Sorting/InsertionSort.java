/*
        0   1  2   3   4  
 arr =  9,  2, 7,  1,  6 

sorted(j=i-1) -< | -> unsorted (i)
              0  | 1  2   3   4  
              9  | 2, 7,  1,  6
       
       int i=1;
       temp = arr[i] = 2;
       int j=0;
       j>=0  temp<arr[j] - 2<9  yes
       arr[j+1] = arr[j]  - arr[1]=9  , j=-1
       9  9  7  1  6 

       int j=-1;
       j>=0  No
       arr[j+1] = temp   - arr[0]=2
       Pass 1: 2  9  |  7  1  6

       ------------------------------------

       int i=2;
       temp = arr[i] = 7;
       int j=1;
       j>=0  temp<arr[j] - 7<9  yes
       arr[j+1] = arr[j]  - arr[2]=9  , j=0
       2  9  9  1  6 

       int j=0;
       j>=0   temp<arr[j] - 7<2  No
       arr[j+1] = temp   - arr[1]=7
       Pass 2: 2  7  9  |  1  6

       ------------------------------------

       int i=3;
       temp = arr[i] = 1;
       int j=2;
       j>=0  temp<arr[j] - 1<9  yes
       arr[j+1] = arr[j]  - arr[3]=9  , j=1
       2  7  9  9  6 

       int j=1;
       j>=0   temp<arr[j] - 1<7  Yes
       arr[j+1]=arr[j]  - arr[2] = 7,  j=0
       2  7  7  9  6

       int j=0;
       j>=0   temp<arr[j] - 1<2  Yes
       arr[j+1]=arr[j]  - arr[1] = 2,  j=-1
       2  2  7  9  6

       int j=-1;
       j>=0   No
       arr[j+1] = temp   - arr[0]=1
       Pass 3: 1  2  7  9  6

       ------------------------------------

       int i=4;
       temp = arr[i] = 6;
       int j=3;
       j>=0  temp<arr[j] - 6<9  yes
       arr[j+1] = arr[j]  - arr[4]=9  , j=2
       1  2  7  9  9   

       int j=2;
       j>=0   temp<arr[j] - 6<7  Yes
       arr[j+1]=arr[j]  - arr[3] = 7,  j=1
       1  2  7  7  9

       int j=1;
       j>=0   temp<arr[j] - 6<2  No
       arr[j+1] = temp   - arr[2]=6
       Pass 4: 1  2  6   7   9   

       --------------------------------------

*/

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        
        //loop for unsorted array 
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            //loop for sorted array shifting (making space for new element to fit)
            while(j>=0 && temp<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            System.out.println(Arrays.toString(arr));
            arr[j+1] = temp;
            System.out.println("pass: "+i+", j: "+(j+1)+" -> "+Arrays.toString(arr));
            System.out.println();
        }
    }

    public static void main(String[] args) {
      //  int arr[] = {56,2,34,20,2,7,5,9};
        int arr[] = { 9,2,7,1,6 };
        
        //System.out.println(Arrays.toString(arr));
        insertionSort(arr);
       // System.out.println(Arrays.toString(arr));
    }
    
}