
public class MinOccurence {

    static void countChar(String s) {
        char maxEle = ' ';
        int maxCount = 0;
        char c[] = s.toCharArray();
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
            if(count > maxCount){
                maxCount = count;
                maxEle = c[i];
            }
        }

        System.out.print(maxEle + " : "+maxCount);
    }

    public static void main(String[] args) {
        String s = "Jaaavva";   // o/p : a=4

        countChar(s);

    }
}

