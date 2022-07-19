public class printsubset1 {
    // here we write the code for revision perpose

    static int cnt=0;
    public static void printallsubset(String s,int i,String ans)
    {
        if(i==s.length())
        {
            System.out.print(ans+" ");
            cnt++;
            return;
        }
        printallsubset(s,i+1,ans+s.charAt(i));
        printallsubset(s,i+1,ans);

    }

    public static void main(String[] args) {
        String s="abc";
        // we have to print all the sub set of given string 
        int i=0;
        String ans="";
        printallsubset(s,i,ans);
        System.out.println(cnt);
    }
    
}
