/*
1089



*/

import java.util.Arrays;

public class DuplicateZeroes {

    public static void duplicateZeros(int[] arr) {
        int possibleLength = 0, n = arr.length - 1;

        // pass 1: finding no of zeroes to be duplicated
        int left = 0;
        while (left <= n - possibleLength) {
            if (arr[left] == 0) {
                // if zero is at boundary and cannot be duplicated
                if (left == n - possibleLength) {
                    arr[n] = 0; // copy without duplication
                    n--; // shift the boundary in
                    break;
                }
                possibleLength++;
            }
            left++;
        }

        // pass 2: copy elements backwards
        int last = left - 1;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleLength] = 0;
                possibleLength--;
                arr[i + possibleLength] = 0;
            } else {
                arr[i + possibleLength] = arr[i];
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0};

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}