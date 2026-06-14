import java.util.Arrays;
import java.util.List;

public class GridChallenge41 {

    public static String sort(String s){
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length()-1-i; j++) {
                if(sb.charAt(j)>sb.charAt(j+1)){
                    char temp = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j+1));
                    sb.setCharAt(j+1, temp);
                }
            }
        }

        return sb.toString();
    }

     public static String gridChallenge2(List<String> grid) {
        boolean res = true;
       
        for (int i = 0; i < grid.size(); i++) {
            String s = grid.get(i);
            grid.set(i,sort(s));
        }

       
        return res ? "YES" : "NO";
    }

    public static String gridChallenge(List<String> grid) {
        int row = grid.size();
        int col = grid.get(0).length();

        char[][] charGrid = new char[row][col];
        
        //converting each string into a sorted char array
        for (int i = 0; i < row; i++) {
            char[] rowChars = grid.get(i).toCharArray();
            Arrays.sort(rowChars);
            charGrid[i]=rowChars;
        }

        //checking if all columns are sorted from top to bottom
        for (int c = 0; c < col; c++) {
            for (int r = 0; r < row-1; r++) {
                if(charGrid[r][c]>charGrid[r+1][c]) return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("abc","ade","efg");

        System.out.println(gridChallenge(ls));
    }
}
