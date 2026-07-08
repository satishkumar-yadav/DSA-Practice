/*
06-July-26   ->   07-July-26
*/

class TheTimeInWords111 {
    public static String timeInWords(int h, int m) {
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty",
            "twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"
        };

        if(m==0) return words[h]+" o' clock";

        if (m == 15) return "quarter past " + words[h];

        if (m == 30)  return "half past " + words[h];

        if (m == 45)  return "quarter to " + words[h+1];

        if (m == 1)  return "one minute past " + words[h];

        if (m <30)  return words[m] + " minutes past " + words[h];

        int rem = 60-m;
        if(rem == 1) return "one minute to " + words[h+1];

        return words[rem] + " minutes to " + words[h+1];
    }

    public static void main(String[] args) {
        int h= 5;
        int m = 45;

        System.out.println(timeInWords(h, m));

    }
    
}