public class permutatuon {
    static int cnt=0;
    public static String swap(String s,int i,int j)
    {
        char c[]=s.toCharArray();
        char temp= c[i];
        c[i]=c[j];
        c[j]=temp;
       String st= new String(c);
       return st;
    }

    public static void permut(String s,int l,int h)
    {
        if(l==h)
        {
            System.out.print(s+" ");
            cnt++;
            return;
        }
        for(int i=0;i<h;i++)
        {
            s= swap(s,l,i);
            permut(s,l+1,h);
            s= swap(s,l,i);


        }
    }
    //here we learn how to solve the problem 
    // print all permutation of given string
    public static void main(String[] args) {
        String s="abcd";
        int l=0;
        int h=s.length()-1;
        permut(s,l,h);
        System.out.println("no of permutaion"+ cnt);
    }  
}
