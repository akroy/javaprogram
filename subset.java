public class subset {
    public static void printSubset(String s,int i,String ans)
    {
        if(i==s.length())
        {
            System.out.print(ans+" ");
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
    }
    
}
