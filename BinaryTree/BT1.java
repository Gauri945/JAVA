 class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data)
     {
      this.data = data;  
     }
   }



public class BT1 {
class main {


  private static int sum(Node root){
        //sum= rooot node + left sum + right sum
        if(root==null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

   
    public static int mul(Node root){
        if(root==null) return 1;
        return root.data * mul(root.left) * mul(root.right);
    }

    public static void main(String[] args) {
       Node n= new Node(100);
       Node n2= new Node(2);
       Node n3= new Node(3);
      Node n4= new Node(4);
     Node n5= new Node(5);
     Node n6= new Node(6);
       
       n.left= n2;
       n.right=n3;
       n2.left =n4;
       n2.right= n5;
       n3.left=n6;

      //  display(n);
      
      //  System.out.println("Sum is"+ sum(n));
       System.out.println("Mul is" + mul(n));
       
    }
 private static  void display(Node root){
    if(root==null) return; //base case
    System.out.println(root.data +"");
    display(root.left);
    display(root.right);

   }

   
    

}

}
    

