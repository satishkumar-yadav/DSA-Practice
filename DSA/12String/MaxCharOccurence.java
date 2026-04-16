


public class MaxCharOccurence {

    static void countChar(String s) { 
        char c[] = s.toCharArray();
        char minEle = ' ';
        int minCount = c.length;
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            if (c[i] == '\u0000')
                continue;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                    c[j] = '\u0000';
                }
            }
            if (count < minCount) {
                minCount = count;
                minEle = c[i];
            }
        }

        System.out.print(minEle + " : " + minCount);
    }

    public static void main(String[] args) {
        String s = "Jaaavva"; // o/p : j=1

        countChar(s);
    }
}
