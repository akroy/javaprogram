public class tute22 {
    public static String swap(String s,int l,int h)
    {

        char c[]= s.toCharArray();
        char temp = c[l];
        c[l]=c[h];
        c[h]=temp;

        String ans= new String(c);
        return ans;
    }

    public static void printPermutation(String s,int l,int h)
    {
      if(l==h)
      {
          System.out.print(s+" ");
          return;
      }
      for(int i=l;i<=h;i++)
      {
          s= swap(s,l,i);
          printPermutation(s,l+1,h);
          s= swap(s,l,i);

      }


    }

    // here we want to write print all permutation of given string
    public static void main(String[] args) {
        String s="abcc";
        int l=0;
        int h=s.length()-1;
        

        printPermutation(s,l,h);
    }
    
}
