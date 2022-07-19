public class sub1 {
    // here we write code for the print all the subset of given string
    // so lets begin
    // with code 
    static int cnt=0;
    public static void printSubset(String s,int i, String ans)
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
        int i=0;
        String ans="";
        printSubset(s,i,ans);
        System.out.println();
        System.out.println("no of subsets "+cnt);

    }
    
}
