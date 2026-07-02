/*
30-Jun-26
*/

import java.util.Arrays;
import java.util.List;

public class GemStones67 {
     public static int gemstones(List<String> arr) {
      //keeps track of characters that are currently valid gemstones
      boolean[] isGemstone = new boolean[26];

      //initializing using first String's unique characters
      String firstRock = arr.get(0);
      for (int i = 0; i < firstRock.length(); i++) {
        isGemstone[firstRock.charAt(i)-'a'] = true;
      }

      //Intersecting with remaining strings
      for (int i = 1; i < arr.size(); i++) {
        String currRock = arr.get(i);
        boolean[] presentInCurrent = new boolean[26];

        //Marking characters seen in current string
        for (int j = 0; j < currRock.length(); j++) {
            presentInCurrent[currRock.charAt(j)-'a']=true;
        }

        //Intersecting : a character stays true only if it's also in current string
        for (int k = 0; k < 26; k++) {
            isGemstone[k]= isGemstone[k] && presentInCurrent[k];
        }
      }

      //counting survived characters
      int count=0;
      for (int i = 0; i < 26; i++) {
        if(isGemstone[i]) count++;
      }

      return count;
    }

    //Bitwise Optimization (O(1) Space)
    public static int gemstones2(List<String> arr) {
        //Setting all 26 bits to 1 initially(representing all characters as candidates)
        int commonMask = (1<<26)-1;

        for(String rock:arr){
            int currMask=0;
            for (int i = 0; i < rock.length(); i++) {
                commonMask |= (1 << (rock.charAt(i)-'a'));
            }
            //Bitwise AND intersection
            commonMask &= currMask;
        }

        return Integer.bitCount(commonMask);   //counting set bits remaining and return
    }    

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("abcdde","baccd","eeabg");

        System.out.println(gemstones(arr));
    }
    
}