public class AlterCase {
    
    static void alterCase(String s){
    char ch[] = s.toCharArray();

    for (int i = 0; i < ch.length; i++) {
        if( ch[i] >= 'A' && ch[i] <= 'Z') ch[i] += 32;    // convert to lower case      - ch[i] >= 'A'  or ch[i] >= 65
        else if(ch[i] >= 'a' && ch[i] <= 'z') ch[i] -= 32; // convert to upper case
    }
    System.out.println(new String(ch));

    }

    public static void main(String[] args) {
        String s1 = "abc";   // o/p : ABC
        String s2 = "ABC"; // o/p : abc
        String s3 = "AbCd"; // o/p : aBcD

        // Convert upper case to lower case and lower case to upper case
        alterCase(s1);
        alterCase(s2);
        alterCase(s3);
    }
}
 