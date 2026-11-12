package quesstions;

public class part1 {

    //POWER OF A POWER N
//      public static double pow(double a, int n){
//         if(n==0) return 1;

//         if(n<0){
//             return 1/pow(a,-n);
//         }
//         double temp = pow(a,n-1);
//         return a*temp;
//      }
//    public static void main(String[] args) {
//        double a=2;
//        int n=2;
//        System.out.println(pow(a,n));
//    }



// ALL TARGET VALUE
// static int count=0;
//   public static void findtarget(int arr[],int target,int i){
//     count++;
//     int n = arr.length;
//     if(i==n){
//          return ;
//     }
    
//     if(arr[i]==target){
//         System.out.print(i+" ");
//     }
//       findtarget( arr , target ,  i+1);
   
//   }

//    public static void main(String[] args) {
//        int arr[] ={ 5,4,2,7,5,2};
//        int target=2;
//        int i=0;  // alwys start from 0

//        findtarget( arr,  target, i);
//        System.out.print("");

//    }




//PRINT IN WORDS
// static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
// public static void print(int number){
//     if(number==0){
//         return;
//     }
//     int last_digit=number%10;
//     print(number/10);
//     System.out.print(arr[last_digit]+" ");
// }

// public static void main(String[] args) {
   
//     int number=4368;
//     print(number);
// }




//issorted or not recurrsion

// public static boolean isSorted(int arr[], int i){
//     if(i==arr.length-1){
//         return true;
//     }
    
//     if(arr[i]>arr[i+1]){
//         return false;
//     }

//     return isSorted(arr,i+1);
// }
// public static void main(String[] args) {
//     int arr[] ={23,54,44,34,67};
//     System.out.println(isSorted(arr, 0));
// }

// public static void main(String[] args) {
//     int a=2;
//     int b=10;
//     System.err.println(pow(a,b));
// }

// public static int pow(int a,int b){
//     if(b==0 ){
//         return 1;
//     }
//     if(a==0){
//         return 0;
//     }

//     int power = pow(a,b/2) * pow(a,b/2);  //power half krkr
                                   // iska square kr lo dubara func ko call kyu hi otherwise right nor TC= O(n)
                                      //after O(log n)
//     //b is odd
//     if(b%2!=0){
//         power = a*power;
//     }
//     return power;
// }




}

