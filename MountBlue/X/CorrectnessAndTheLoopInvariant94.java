/*
05-July-26
*/

public class CorrectnessAndTheLoopInvariant94 {
   // debuggged code
    public static void insertionSort2(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    //original code
    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j > 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }
    
    public static void main(String[] args) {
        int [] arr = {7, 4, 3, 5, 6, 2};

        insertionSort2(arr);

        //System.out.println(Arrays.toString(arr));
    }
}