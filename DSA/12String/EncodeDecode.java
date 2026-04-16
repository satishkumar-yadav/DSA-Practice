public class EncodeDecode {
    
    static String encode(String s, int n){
        char ch[]= s.toCharArray();   
        
        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i])){
              ch[i] = (char) (((((ch[i]+n -'A')%26)+26)%26)+'A'); 
            }
            if (Character.isLowerCase(ch[i])) {
                ch[i] = (char) (((((ch[i] + n - 'a') % 26) + 26) % 26) + 'a');
            }
        }
        return new String(ch);
    }
    
    static String deCode(String s, int n) {
          return encode(s,-n);
    }
    
    public static void main(String[] args) {
        String s1 = "abc", s2= "xyz";
        System.out.println(encode(s1, 3));
        System.out.println(encode(s2, 3));
        
        System.out.println(deCode(encode(s1, 3),3));
        System.out.println(deCode(encode(s2, 3),3));
        System.out.println(deCode(s1, 3));
        System.out.println(deCode(s2, 3));
        
    }
    
}
