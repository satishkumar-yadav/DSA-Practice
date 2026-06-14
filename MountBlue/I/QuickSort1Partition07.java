
/*




*/

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        int p = arr.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        // equal.add(p);

        for (Integer n : arr) {
            if (n > p)
                right.add(n);
            else if (n < p)
                left.add(n);
            else
                equal.add(n);
        }

        List<Integer> res = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < left.size() || j < equal.size() || k < right.size()) {
            if (i < left.size())
                res.add(left.get(i++));
            else if (j < equal.size() && i >= left.size())
                res.add(equal.get(j++));
            else if (k < right.size() && i >= left.size() && j >= equal.size())
                res.add(right.get(k++));
        }

        return res;
    }

}

public class QuickSort1Partition07 {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = 5;
        int [] arrTemp = {4,5,3,7,2};
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //int arrItem = Integer.parseInt(arrTemp[i]);
           // arr.add(arrItem);
           arr.add(arrTemp[i]);
        }

        List<Integer> result = Result.quickSort(arr);

        System.out.println(result);

        // for (int i = 0; i < result.size(); i++) {
        //     bufferedWriter.write(String.valueOf(result.get(i)));

        //     if (i != result.size() - 1) {
        //         bufferedWriter.write(" ");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
