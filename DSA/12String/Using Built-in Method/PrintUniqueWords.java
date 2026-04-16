/*
 i/p: Happy Happy Birthday to You You
 o/p: Birthday to
*/

public class PrintUniqueWords {
    
    public static void uniqueWords(String s) {
        String str[] = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            int count=1;
            if (str[i] == "")
                continue;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]))
                   {
                    count++;
                    str[j] = "";
                   }
            }

            if(count==1)
            System.out.print((str[i] + " "));
        }

    }

    public static void main(String[] args) {
        String s = "Happy Happy Birthday to You You";

        uniqueWords(s);
    }

}
