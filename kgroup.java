public class kgroup {
    class Solution {
    
        public static ListNode reverse(ListNode temp)
        {
            ListNode curr= temp;
            ListNode pre= null;
            ListNode ne= null;
            while(curr!=null)
            {
                ne= curr.next;
                curr.next= pre;
                pre= curr;
                curr= ne;
            }
            temp= pre;
            
            return temp;
            
        }
        public ListNode reverseKGroup(ListNode head, int k) {
            // LinkedList<Integer> list= new LinkedList<>();
            // ArrayList<Integer>list= new ArrayList<>();
             ListNode pesent= head;
             ListNode nenode= new ListNode(-1);
            
            while(pesent!=null)
            {
           
            int cnt =1;
            ListNode temp= head;
            
            while(cnt<k)
            {
                temp= temp.next;
                cnt++;
                  
            }
                
            ListNode t1=reverse(temp);
            
            
            for(int i=0;i<k;i++)
            {
                // list.add(temp.val);
                int x= t1.val;
                
                ListNode newnode= new ListNode(x);
                
                nenode.next=newnode;  
                t1=t1.next;
            }
            } 
            return nenode.next;  
        }
    }
    
}
