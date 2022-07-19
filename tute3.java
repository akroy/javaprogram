public class tute3 {
    static int cnt=0;

    public static String swap(String s,int l,int h)
    {
        char c[]= s.toCharArray();

        char temp= c[l];
        c[l]=c[h];
        c[h]=temp;

        String st= new String(c);

        return st;
    }

    public static void printPermu(String s,int l,int h)
    {
        if(l==h)
        {
            System.out.print(s+" ");
            cnt++;
            return;
        }
        for(int i=l;i<=h;i++)
        {
            s= swap(s,l,i);
            printPermu(s,l+1,h);
            s= swap(s,l,i);
            // now we weite the fucntion for swap method 


        }
    }
    public static void main(String[] args) {
        // here again we print all permutation on given string 

        String s="abc";
        // we have to print all permutation of given string 
        // here in case of abc we have only thre charecter then the 
        // total permutation of given string is 6 ;

        int l=0;
        int h= s.length()-1;
        printPermu(s,l,h);

        System.out.println(cnt);// this will print all permutation count.

    }
    
}
