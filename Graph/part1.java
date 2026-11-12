public class part1 {
    //DFS IN matrix
//     class Main {
//     static void traversal(int[][] mat , int cr , int cc , int rows,int cols, boolean [][]vis){
//         if(cc>= cols || cr>=rows || (vis[cr][cc]==true)){
//             return;
//         }
//         vis[cr][cc]=true;
//         System.out.println(mat[cr][cc]);
//         traversal(mat,cr,cc+1,rows,cols,vis);//right call
//         traversal(mat,cr+1,cc,rows,cols,vis);//down call
//     }
//     public static void main(String[] args) {
//       int [][] mat={
//           {1,2,3,4},
//            {5,6,7,2},
//             {9,0,0,7},
//              {6,8,5,8},
//       };
//       int m= mat.length;
//       int n= mat[0].length;
//       boolean [][] vis = new boolean [m][n]; //by deafault false
//       traversal(mat,0,0,mat.length,mat[0].length,vis);
//     }
// }
}
