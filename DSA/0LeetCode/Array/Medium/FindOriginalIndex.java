import java.util.Arrays;

public class FindOriginalIndex {
    public static void main(String[] args) {
        int target =6;
        int [][] arr= {{1,2,3},
                        {4,5,6},
                        {7,9,10} };
        int [] arr2 =  new int [arr.length*arr.length];
        int ind=0;
        
        for (int[] m : arr) {
            for (int n : m) {
                arr2[ind++] = n;
            }
            
        }

      //  System.out.println(Arrays.toString(arr2));

       // int index = binSearch(arr2,target);
       // int row = index/arr.length;
       // int col= index%arr.length;

       // System.out.println(row+","+col);

        int res[] = bSearch(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[]  bSearch(int a[][], int target){
        int m=a.length; //3
        int n=a[0].length; //3
        int low=0;   
        int high=m*n-1; //8
        int row=0;
        int col=0;
        while (low<=high) {
            int mid = low+(high-low)/2;  // 4
            row= mid/m;    // 4/3 = 1
            col= mid % n;  // 4%3 = 1
            if(a[row][col]==target) return new int[]{row,col};
            else if(a[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return new int[]{row,col};
    }

    static int binSearch(int a[],int target){
        int low = 0, high= a.length-1;
       
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if(a[mid]==target) return mid;
            else if(a[mid]<target) low=mid+1;
            else high= mid-1;
        } 
        return low;
    }
}
