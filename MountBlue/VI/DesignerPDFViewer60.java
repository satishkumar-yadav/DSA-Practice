/*

24-Jun-26

*/

import java.util.Arrays;
import java.util.List;

class DesignerPDFViewer60 {

    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;
        int n = word.length();

        //finding tallest letter in word
        for (int i = 0; i < n; i++) {
            char curChar = word.charAt(i);

            //Mapping character to its 0-25 index
            int targetAlphabetIndex = curChar-'a';

            //fetching height from list
            int curLetterHeight = h.get(targetAlphabetIndex);

            //keeping track of tallest height found
            if(curLetterHeight>maxHeight) maxHeight=curLetterHeight;
        }

        return maxHeight*n;
    }

    public static void main(String[] args) {
        List<Integer> h = Arrays.asList(1 ,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
        String word = "zaba";

        System.out.println(designerPdfViewer(h, word));
    }
    
}