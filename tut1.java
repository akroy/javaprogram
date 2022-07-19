public class tut1 {
    public static boolean ispalindrom(String s,int i,int r)
    {

        if(i>=r)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(r))
        {
            return false;
        }
        return ispalindrom(s, i+1, r-1);

    }
    public static void main(String[] args) {
        // here we have to check given string is palindroooom or not 
        // using recursion
        String s="racecar";
        int i=0;
        int r=s.length()-1;
        if(ispalindrom(s,i,r))
        System.out.print("string is palindrom");
        else 
        System.out.print("not palindrom");

    }
    
}
