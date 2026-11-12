package LL;

// class car{
//     int price;
//     String name;
//     car(int price,String name){
//         this.price=price;
//         this.name=name;
//     }
// }

class Node{     //use in all the files of this folder
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class part1 {

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }


    public static void diplayrecursively(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.val);
        diplayrecursively(head.next);
    }
    public static void main(String[] args) {
        
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
       a.next=b;
       b.next=c;
      print(a);
      diplayrecursively(a);
       
        // Node temp=a; //shallow copy or excess of a
        // System.out.println(temp.val);
        // temp=temp.next;
        // System.out.println(temp.val)


        // Node temp=a;
        // while(temp!=null){
        //     System.out.println(temp.val);
        //     temp=temp.next;
        // }  //better way print so we make it a function

        

        // a.next=b;   //linking
        // b.next=c;
        //    System.out.println(a );  //adress of node a
        //    System.out.println(a.val);
        //    System.out.println(a.next);  //by default its null before linking nd after linking it will show the same address od a and b
   
        // System.out.println(a.val);
        //  System.out.println(a.next.val);   //b.val
        //   System.out.println(a.next.next.val);   //c.val
   
    } 
}
