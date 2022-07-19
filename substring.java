public class substring {
    // here we write the program for  print all permutation of given string 

    // using recursion
    
    public static String swap(String s,int i,int j)
    {
        char c[]= s.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

        String st= new String(c);

        return st;
    }

    public static void printallpermu(String s,int l,int h)
    {
        if(l==h)
        {
            System.out.print(s+" ");
            return;
        }
        for(int i=l;i<=h;i++)
        {
            s=swap(s,l,i);
            printallpermu(s,l+1,h);
            s= swap(s,l,i);

        }


    }
    public static void main(String[] args) {
        String s="abc";

        int l=0;
        int h=s.length()-1;
        printallpermu(s,l,h);
    }
    
}
