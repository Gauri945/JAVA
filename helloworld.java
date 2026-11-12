class helloworld{
    public static void main(String[] args){
        //System.out.println("Hello World");
       /*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt ();
        int y = sc.nextInt ();
        System.out.println(x+y);
        sc.close();*/
        int arr[]={2,5,56,78};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return temp;
        

    }
}