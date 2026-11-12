//QUIZEE QUESTION
/*public class practiceset6 {
    public static void main(String[] args) {
        int [] arr = {4,9,5,56};
        for(int i=0;i<arr.length;i++){   // printing array
            System.out.println(arr[i]);}
        
        for (int j = arr.length - 1 ; j>=0 ; j--){ // printing reverse of arrary
            System.out.println(arr[j]);}
        

        

    }
    
}*/

//2D Arrayyyyy
/*public class practiceset6{
    public static void main(String[] args) {
        int [][] flats = {
            {7,9,5},
            {5,8,9} };
        for (int i=0; i<flats.length;i++){
            for(int j=0; j<flats[i].length ; j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}*/

public class practiceset6{
    public static void main(String[] args) {
        //Questionnn 1
        /*float [] arr= { 18.9f , 67f , 56.8f , 87.9f ,90f } ;
        float sum =0;
        for(float ele : arr){
            sum = sum+ele; 
        }  
        System.out.println(sum);*/

        //Questionnn 2
                /*float [] arr= { 18.9f , 67f , 56.8f , 87.9f ,90f } ;
                float num=56.8f;
                boolean isInArray = false ;
                for (float ele : arr){
                    if(num==ele){
                        isInArray = true;
                        break;
                    }
                }
                if(isInArray){
                    System.out.println("present");
                }
                else{
                    System.out.println("not presnt");
                }*/
        

            //Questionn3 
            /*float [] arr= { 18.9f , 67f , 56.8f , 87.9f ,90f } ;
            float sum =0;
            for(float ele : arr){
                sum = sum+ele; 
            }  
            System.out.println(sum/arr.length); //averagee*/
        

       // Questionnn4
        /*int [][] mat1 = {{4,7,8},
                         {6,8,0}};
        int [][] mat2 = {{4,2,8},
                         {8,2,0}};  
        int result [][]={{0,0,0},
                         {0,0,0}} ;
        for(int i=0; i <mat1.length ;i++){
            for(int j=0 ; j<mat1[i].length;j++ ){
                result[i][j]= mat1[i][j]+ mat2[i][j];
                System.out.println(result[i][j]);
            }
        } */                             
        
        
    //Questionnn5
    // sam as quize question 1

    //Questionn6
    /*int [] arr = {4,9,5,56};
    int max = arr[0];
    for(int i =0 ; i<arr.length ; i++){
        if(arr[i]>arr[0]){
            max = arr[i];
        }

    }
    System.out.println(max);*/


    //Questionnn7
        /*int [] arr = {4,9,5,56};
        int min = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
       System.out.println(min);*/
        
    //Questionnnn8 
    /*boolean isSorted = true;
    int [] arr = {6,3,87,56,30};
    for(int i = 0 ; i<arr.length; i++){
        if(arr[i]>arr[i+1]){
            isSorted = false;
            break;

        }
    }
    if(isSorted){
        System.out.println("sortedd");
    }
    else{
        System.out.println("not sortedd");
    }*/

     }
}


