import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class btree {
    public static class node{
        int data;
        node left;
        node right;

        node(int data)
        {
            this.data=data;
            this.left= null;
            this.right= null;

        }
    }

    public static class binarytree{
        static int idx=-1;

        public node buildtree(int nodes[]){

          idx++;
          if(nodes[idx]==-1)
          {
              return null;
          }
          node newnode= new node(nodes[idx]);
          newnode.left= buildtree(nodes);
          newnode.right=buildtree(nodes);

          return newnode;


        }

        
    }
    public  static void preorder(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public  static void postorder(node root)
    {
        if(root==null)
        {
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public  static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }
    public static void lvloreder(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            node currnode= q.poll();
            if(currnode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }

            }
            else
            {
                System.out.print(currnode.data+" ");

                if(currnode.left!=null)
                {
                    q.add(currnode.left);
                }
                if(currnode.right!=null)
                {
                    q.add(currnode.right);
                }

            }
        }
    }
    public static int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight= height(root.left);
        int rightheight= height(root.right);

        return Math.max(leftheight, rightheight)+1;
    }
    public static int diameter(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int d1= diameter(root.left);
        int d2= diameter(root.right);
        int d3= height(root.left)+height(root.right);

        return Math.max(d3, Math.max(d1, d2))+1;
    }

    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes[]={1,2,5,7,-1,-1,-1,6,-1,-1,8,-1,6,11,-1,-1,9,-1,-1};
        binarytree tree= new binarytree();
        node root=tree.buildtree(nodes);
        System.out.println(root.data);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        lvloreder(root);
        System.out.println();
       System.out.println( height(root));
       System.out.println();
       System.out.println(diameter(root));
        
        
    }
    
}
