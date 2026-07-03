/*
02-July-26
*/

import java.util.Arrays;
import java.util.List;

public class LisasWorkbook77 {
   public static int workbook(int n, int k, List<Integer> arr) {
        int specialProb=0;
        int currPage=1;

        //looping through each chapter
        for (int i = 0; i < n; i++) {
            int probInChapter = arr.get(i);

            //tracking problems on current page
            for(int prob=1; prob<=probInChapter; prob++){
                //if prob index matches page number
                if(prob==currPage) specialProb++;

                //if a page is full(reaches capacity k), flip to next page
                //Except if it is the very last prob of the chapter (handled right below)
                if(prob % k == 0 && prob<probInChapter) currPage++;
            }

            //after finishing a chapter, always flip to new page for next chapter
            currPage++;
        }

        return specialProb;
    }

    public static void main(String[] args) {
        int n=5;
        int k=3;
        List<Integer> arr = Arrays.asList(4,2,6,1,10);

        System.out.println(workbook(n, k, arr));
    }
     
}