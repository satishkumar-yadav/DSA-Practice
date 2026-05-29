import java.util.Stack;

public class CountingValleys {

    //inefficient sol for this prob, space comp O(n)
    public static int countingValleys2(int steps, String path){
      Stack<Character> st = new Stack<>();
      int valleyCount = 0, altitude=0;

      for (int i = 0; i < steps; i++) {
        char ch = path.charAt(i);
        if(ch=='D') {
            //if at sea level(0) and going down, entering a new valley
            if(altitude==0) st.push(ch); //D
            else if(altitude<0){
                //if already inside valley, track depth
                st.push(ch); // D
            }
            altitude--;
        }
        else if(ch=='U'){
            altitude++;
            //if at below sea level, this U step cancels out a D step
            if(altitude<=0){
                st.pop();
                //if st is empty, means just emerged from valley
                if(st.isEmpty() && altitude==0) valleyCount++;
            }
        }
 
      }
        
        return valleyCount;
    }

    public static int countingValleys(int steps, String path){
      int altitude=0, valleyCount=0;

      for (int i = 0; i < steps; i++) {
        char ch = path.charAt(i);
        if(ch=='U'){
            altitude++;
            //if stepping up and hit exactly 0, means just completed a valley
            if(altitude==0) valleyCount++;
        }
        else if(ch=='D'){
            altitude--;
        }
      }
      return valleyCount;
    }

    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int steps = path.length();

        System.out.println(countingValleys(steps,path));
        System.out.println("2: "+countingValleys2(steps,path));
    }
}
