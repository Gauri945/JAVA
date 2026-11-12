public class dsa {

//    public  static void print (int [] arr){
//             for(int ele: arr){
//                 System.out.print( ele +" " );
//             }
//         }
   // public static void mergeArray(int a[] , int b[], int arr[]) {
        // MERGE 2 SORTED ARRAY
         
        
        // int [] a ={23,56,78,90};
        // int [] b={33,45,67,89,99,200};
       
    //     int i= a.length-1;
    //     int j= b.length-1;
    //     int k=  arr.length-1;
        

    //     while( j>=0){
    //         if( i>=0 && a[i]>b[j]){
    //             arr[k]=a[i];
    //             k--;
    //             i--;
    //         }
    //         else{
    //             arr[k]=b[j];
    //             j--;
    //             k--;
    //         }
    //     }
    //    while(i>=0){
    //     arr[k]=a[i];
    //     k--;
    //     i--;
    //    }
    //    while(j>=0){
    //     arr[k]=b[j];
    //     k--;
    //     j--;
    //    }
       
    // }




    // //MERGE SORT

    // public static void mergesort(int [] arr){

      
    //     int n=arr.length; 
    //     if(n==1) return;
    //      // create two array
    //     int [] a= new int[n/2]; 
    //     int [] b= new int[n-n/2];   //divide and copy paste
    
    //     for(int i=0 ;i<n/2;i++){
    //         a[i]=arr[i];
    //     }
    //      for(int i=0 ;i<n-n/2;i++){
    //         b[i]=arr[i+n/2];
    //     }
    //   //Magic recursion
    // mergesort(a);
    // mergesort(b);

    // //merge
    // mergeArray(a, b, arr);




    // }




    // public static void main(String[] args) {
    //     int [] arr={ 80,30,50,20,60,10,70,40};
    //     mergesort(arr);
    //     print(arr);
    // }
    
   

    // N QUEENS--------->>>>



    public static boolean isSafe(char board[][], int row , int col ){
            //hmesha upr wala hi checkkrege

            //vertical up

            for(int i=row-1; i>=0;i--){
                if(board[i][col] =='Q'){
                    return false;
                }
            }

            //diagonal left up
            for(int i=row-1,j=col-1; i>=0 && j>=0 ;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }

            //diagonal right up
            for(int i=row-1, j=col+1 ; i>=0 && j< board.length; i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
    }

    //sirf baitha rhe h check nhi kr rhe h ki safe h ki nhi hai
    public static void nQueens(char board[][] ,int row){

        if(row==board.length){
            printBoard(board);
            return;
        }
       for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){   //check kr rhe
        board[row][j]='Q';
        nQueens(board,row+1);  // row mai baityhana
        board[row][j]='.';  //phr backtarck hua or vha se hta diya
    }}

    }

    public static void printBoard(char board[][]){
        System.out.println("---Chees board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        // initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
         nQueens(board,0);
   
   
    }

    




}
