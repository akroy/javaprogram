public class tute2 {

    // this function check wether the given string is palindrom or not 
    // if given string is palindrom then its return true otherwise its return false;


    public static boolean ispalindrom(String s,int l,int h)
    {
        if(l>=h)
        {
            return true;
        }
        if(s.charAt(l)!=s.charAt(h))
        {
            return false;
        }
        return ispalindrom(s,l+1,h-1);
    }
    public static void main(String[] args) {
        // here we check the given string is palindrom or not

        String s="raceca";
        int l=0;
        int h= s.length()-1;

        if(ispalindrom(s,l,h)){
            System.out.println(" palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }
    }
}
