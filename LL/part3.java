
//DOUBLEY LINKED LIST


class dnode{
    int val;
    dnode next;
    dnode prev;
    dnode(int val){
        this.val =val;
    }
}
public class part3 {

    public static void print(dnode head ){
        dnode temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
        System.out.println();


    }
    public static void main(String[] args) {
        dnode a=new dnode(10);
         dnode b=new dnode(20);
          dnode c=new dnode(30);

          a.next=b; b.prev=a;
          b.next=c; c.prev=b;
          print(a);

    }
}
