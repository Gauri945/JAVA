public class gauri {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6};
        // int target =3;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //     System.out.println(arr[i]);}

      //2D array
      
      // MAXIMUM of arrayyyy
     int m=2;
     int n =3;
      int [][] arr = new int [m][n];
         int mx= Integer.MIN_VALUE;
         for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                mx = Math.max(mx,arr[i][j]);
            }
         }
         System.out.println(mx);

        
    }
}
