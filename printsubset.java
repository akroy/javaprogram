public class printsubset {
    // here we print all subset of given string 
    public static void printallsubset(String s,int l,String ans)
    {
        if(l==s.length())
        {
            System.out.print(ans+" ");
            return;
        }
        printallsubset(s,l+1,ans+s.charAt(l));
        printallsubset(s,l+1,ans);


    }

    public static void main(String[] args) {
        String s= "abc";
        int l=0;
        String ans= "";
        printallsubset(s,l,ans);

    }
    
}
