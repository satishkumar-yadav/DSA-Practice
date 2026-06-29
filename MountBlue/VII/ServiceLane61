/*

25-Jun-26

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ServiceLane61 {
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        List<Integer> res = new ArrayList<>();

        for (List<Integer> curCase : cases) {
            int entryIndex = curCase.get(0);
            int exitIndex = curCase.get(1);

            int minWidthRange = 3;

            for (int i = entryIndex; i <= exitIndex; i++) {
                int curSegmentWidth = width.get(i);
                if (curSegmentWidth < minWidthRange)
                    minWidthRange = curSegmentWidth;
                if (minWidthRange == 1)
                    break;

                res.add(minWidthRange);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        
    }
    
}


class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int t = Integer.parseInt(firstMultipleInput[1]);
        String[] widthTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> width = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthTemp[i]);
            width.add(widthItem);
        }
        List<List<Integer>> cases = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] casesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> casesRowItems = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowTempItems[j]);
                casesRowItems.add(casesItem);
            }
            cases.add(casesRowItems);
        }
        List<Integer> result = Result.serviceLane(n, cases);
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));
            if (i != result.size() - 1) bufferedWriter.write("\n");
        }
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
