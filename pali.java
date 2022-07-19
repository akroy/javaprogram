import javax.lang.model.util.ElementScanner14;

public class pali {
    public static boolean ispalin(String s,int i,int j){

        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        return ispalin(s, i+1, j-1);

    
    }
    public static void main(String[] args) {
        
        String s="racecar";
        int n= s.length();

         int i=0;
         int j=n-1;

        if(ispalin(s,i,j))
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }
    }
}
