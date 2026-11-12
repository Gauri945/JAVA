package LL;

class SLL{      //singly linked list
    Node head;
    Node tail;
    int size=0;

    void insertAtEnd(int val){
        Node temp =new Node(val); //if LL is empty
        if(head==null){
            head=temp;
            tail=temp;
        }
    else{
        tail.next=temp;
        tail=temp;
    }
    size++;
 }

 void insertAtStart(int val){
        Node temp =new Node(val); //if LL is empty
        if(head==null){
            head=temp;
            tail=temp;
        }
    else{
        temp.next=head;
        head=temp;
    }
    size++;
 }


 void size(){
    System.out.print(size);
 }

void insert(int idx,int val){


     if( idx<0  || idx>size){
        System.out.print("Invalid");
        return;
    }
    if(idx==0){
        insertAtStart(val);
        return;
    }
    if(idx==size){
        insertAtEnd(val);
        return;
    }
    
    Node temp = new Node(val);
    Node x = head;
    for(int i=1;i<=idx-1;i++){
        x=x.next;
    }
    temp.next=x.next;
    x.next=temp;
   
    size++;
   
}



int getElement(int idx){
    if(idx==size-1) return tail.val;
    if(idx>=size || idx<0){
        System.out.println("invalid ");
        return -1;
    }
    Node temp=head;
    for(int i=1;i<=idx;i++){
        temp=temp.next;
    }
    return temp.val;

}


void delete(int idx){

   //only del except 0 or last indx
    if(head==null){
        System.out.println("invalid");
        return;
    }
    if(idx<0 || idx>=size){
        System.out.println("invalid");
        return;
    }

    Node temp= head;
    for(int i=1;i<=idx-1;i++){  // ek kaam index tak
        temp=temp.next;
    }
    temp.next=temp.next.next;   
    size--;
}



 void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
public class part2 {


     
 public static void main(String[] args) {
        //IMPLEMENTING
         SLL list =new SLL();
        //  list.insertAtEnd(10);
        //  list.insertAtEnd(60);
        //  list.insertAtEnd(10);

          list.insertAtStart(50);
        //  list.insertAtStart(80);
        //  list.insertAtStart(90);
        //  list.display();

         list.insert(0,100);
         list.display();
        // System.out.println(list.getElement(1));
        list.delete(1);
        list.display();
         
    }
    
    
}
