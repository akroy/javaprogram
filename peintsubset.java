public class peintsubset {
    static int cnt=0;

    public static void printSubset(String s,int i,String ans)
    {
        if(i==s.length())
        {
            System.out.print(ans+" ");
            cnt++;
            return;
        }
        printSubset(s,i+1,ans+s.charAt(i));
        printSubset(s,i+1,ans);

    }

    public static void main(String[] args) {
        String s="abc";
        // we have to print all sub set of given string 
        // a, b,c,abc," "  toat count of sub set is 5;
        int i=0;
        String ans= "";
        printSubset(s,i,ans);
        System.out.println(cnt);// this will print total count of string 
        

    }
    
}
