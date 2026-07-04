/*

25-Jun-26 :-  03-July-26

*/

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
 // import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane61 {
    public static List<Integer> serviceLane2(int n, List<List<Integer>> cases, List<Integer> width) {
        List<Integer> res = new ArrayList<>();

        for (List<Integer> curCase : cases) {
            int entryIndex = curCase.get(0);
            int exitIndex = curCase.get(1);

            //int minWidthRange = 3;
            int minWidthRange = Integer.MAX_VALUE;

            for (int i = entryIndex; i <= exitIndex; i++) {
                int curSegmentWidth = width.get(i);
                if (curSegmentWidth < minWidthRange)
                    minWidthRange = curSegmentWidth;
                if (minWidthRange == 1)  break;
                // res.add(minWidthRange);
            }
            res.add(minWidthRange);
        }

        return res;
    }

    // original function - but contains wrong signature / parameter
    // public static List<Integer> serviceLane(int n, List<List<Integer>> cases) {
    //     // Write your code here

    // }

    public static void main(String[] args) {
        int n = 8;
        int t = 5;
        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3));
        List<List<Integer>> cases = new ArrayList<>(Arrays.asList(
                Arrays.asList(0,3),
                Arrays.asList(4,6),
                Arrays.asList(6,7),
                Arrays.asList(3,5),
                Arrays.asList(0,7)
            ) ); // [[0,3],[4,6],[6,7],[3,5],[0,7]]


            System.out.println(serviceLane2(n, cases, width));
    }
    
}


class Solution {
    //public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

       // int n = Integer.parseInt(firstMultipleInput[0]);  // 8
      
       // int t = Integer.parseInt(firstMultipleInput[1]);  // 5
    
       // String[] widthTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

       // List<Integer> width = new ArrayList<>();   // [2,3,1,2,3,2,3,3]

        // for (int i = 0; i < n; i++) {
        //     int widthItem = Integer.parseInt(widthTemp[i]);
        //     width.add(widthItem);
        // }

        // List<List<Integer>> cases = new ArrayList<>();  // [[0,3],[4,6],[6,7],[3,5],[0,7]]

        // for (int i = 0; i < t; i++) {
        //     String[] casesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        //     List<Integer> casesRowItems = new ArrayList<>();

        //     for (int j = 0; j < 2; j++) {
        //         int casesItem = Integer.parseInt(casesRowTempItems[j]);
        //         casesRowItems.add(casesItem);
        //     }

        //     cases.add(casesRowItems);
        // }

        // List<Integer> result = Result.serviceLane(n, cases);

        // for (int i = 0; i < result.size(); i++) {
        //     bufferedWriter.write(String.valueOf(result.get(i)));

        //     if (i != result.size() - 1) {
        //         bufferedWriter.write("\n");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
   // }
}

