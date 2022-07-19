import java.util.ArrayList;

public class subsetnumber {

    public static void printsubset(int a[],int i,ArrayList<Integer> list)
    {
        if(i==a.length)
        {
            System.out.print(list);
            return;
        }
        printsubset(a,i+1,list.add(a[i]));
        printsubset(a,i+1,list);


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int i=0;
       ArrayList<Integer>list= new ArrayList<>();
        printsubset(a,i,list);


    }
    
}
