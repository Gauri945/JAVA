import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine(); //direct array input k liye     so phle humn string mai input liya  then usko split kiya space k bses pr 
        String w[]=s.split(" ");  //4 5 67 89 sting mai ese lge input 
        int a[]= new int [w.length];
        for(int i=0;i<w.length;i++){
            a[i]=Integer.parseInt(w[i]);   //phir usko int mai convert 
        }

    }
}
