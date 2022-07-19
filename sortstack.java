import java.util.Stack;

public class sortstack {
    public static  void insertpos(Stack<Integer>s,int x)
    {
        if(s.isEmpty()||s.peek()<x)
        {
            s.push(x);
            return;
        }
        int temp= s.pop();
        insertpos(s,x);
        s.push(temp);

    }

    public static Stack<Integer> sort(Stack<Integer>s)
    {

        if(!s.isEmpty())
        {
            int x= s.pop();
            sort(s); // here we have to write two sort function 
            // one is sort function and another is insertpos function
            // which is define in the top of the code
            insertpos(s,x);
        }
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer>s= new Stack<>();
        s.push(12);
        s.push(1);
        s.push(55);
        s.push(90);
        s.push(67);

        sort(s);

        System.out.print(s);


    }
    
}
