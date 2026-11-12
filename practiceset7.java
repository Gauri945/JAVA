// 2 ways to call methodd 
/*public class practiceset7 {
     int mysum(int x , int y){ // static int....then use line no 17
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;


        }
        static void telljoke(){           // void which dont return anything we can directly call this without making any object
            System.out.println("heheh nothinggg");
    
    }
    public static void main(String[] args) {
        int a= 5;
        int b =10;
        int c ;
       // c = mysum(a,b);  static likha hai h to y wala use
       practiceset7 obj = new practiceset7(); // static nhi likga to ye wala by creating object
       c= obj.mysum(a,b);
        System.out.println(c);

        telljoke();
        
    }
    
}*/

/*public class practiceset7{
    static void change(int [] arr){
        arr[0]=98;
    }
  public static void main(String[] args) {
        int[] marks ={43,56,75,87,77,18};
        change(marks);                //in case of array main function ki copy nhi hoti hai
                                       // nd vo method mai jakr change ho skta hai
        System.out.println(marks[0]);
    
    }
}*/
 
// variable arguments
 /*public class practiceset7{
    static int sum(int...arr){
        int result =0 ;
        for(int a :arr){
            result = result+a;
            
        }
        return result;


    } 
    public static void main(String[] args) {
     System.out.println( "sum is " +sum(4,6,7,0));   
     System.out.println("other sum is " + sum(4,6)); // so hume har sum k liye alg method nhi likhn hoga
    }
}*/

public class practiceset7{
    static void multiplication (int n){
        for(int i=1 ; i<=10 ; i++){
            System.out.println(i*n);
        }
    
    }
     static void patttern (int x){
        for(int i=0 ; i<x; i++){
            for(int j=0 ; j<i+1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
     static int sumNac(int y){
        if(y==1){
            return 1;
        }
        return y+sumNac(y-1);
     }

     static int fib ( int g){
        int q =0;
        int w = 1;
       for(int i =1 ; i<=g ; i++){
        int nextTerm = q+w;
        q=w;
        w=nextTerm;
    }
        return w;
       
     }
    public static void main(String[] args) {
        //Questionn 1
        multiplication(2);

        //Questionnn2
        patttern(4);

        //Questionn3
         int c=sumNac(4);
        System.out.println(c);

         //Questionn4  0,1,1,2,3,5,8....
            int result = fib(6);
            System.out.println(result);

         
         



    }
}


