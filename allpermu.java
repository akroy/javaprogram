public class allpermu {
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


    public static void allPermutation(String s,int l,int h)
    {
        if(l==h)
        {
            System.out.print(s+" ");
            cnt++;
            return;
        }
        for(int i=l;i<=h;i++)
        {
            s=swap(s,l,i);
            allPermutation(s,l+1,h);
            s= swap(s,l,i);

        }
    }
    public static void main(String[] args) {
        String s= "ab";
        // we have to print all permutation of given string 
        // so lets start 
        int l=0;
        int h= s.length()-1;


        allPermutation(s,l,h);
        System.out.println(cnt);

    }
    
}
