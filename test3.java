public class test3 {

    // public static String swap(String s,int l,int h)
    // {
    //     char c[]= s.toCharArray();
    //     char temp= c[l];
    //     c[l]=c[h];
    //     c[h]= temp;

    //     String st= new String(c);

    //     return st;


    // }
    // public static void allPermu(String s,int l,int h)
    // {
    //     if(l==h)
    //     {
    //         System.out.print(s+" ");
    //         return;
    //     }
    //     for(int i=l;i<h;i++)
    //     {
    //         s= swap(s,l,i);
    //         allPermu(s,l+1,h);
    //         s= swap(s,l,i);

    //     }
    public static int minOp(char c1[],char c2[])
    {
        if(c1.length==c2.length)
        {
            return 0;
        }
        int i=0;
        int j=0;
        int cnt=0;
        while(c1.length!=0&&c2.length!=0)
        {
            if(c1[i]==c2[j])
            {
                cnt++;
            }
            else
            {
                

            }


        }
        return cnt;


    }

    public static int  mimoperation(String s1,String s2)
    {

        char c1[]= s1.toCharArray();
        char c2[]= s2.toCharArray();
      return  minOp(c1,c2);

    }

    }
    public static void main(String[] args) {
        
        String s1= "horse";
        String s2= "ros";
        
       System.out.println( mimoperation(s1,s2));


     

        
    }
    
}
