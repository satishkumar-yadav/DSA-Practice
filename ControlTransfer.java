class ControlTransfer 
{
    public static void main(String[] args) {
        m1();
    }

    // java program for even number to print odd number
    public static void m1(){
        for(int i=1; i<8; i++)
            {
                if(i%2==0) continue;
                System.out.println(i);
            } 
    }
}