// Questionn 2>>>>
/*import java.util.Scanner;
public class practiceset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 subjects marks");
        byte m1 = sc.nextByte();
        byte m2=sc.nextByte();
        byte m3= sc.nextByte();
        float per = (m1+m2+m3)/3.0f;
        System.out.println("overall percentage is "+ per);
        if(per >= 40 && m1 >=33 && m2>=33 && m3>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }


        
    }
    
}*/


//Questionn 4>>>>>
/*import java.util.Scanner;
public class practiceset4{
    public static void main(String[] args) {
        float  tax =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter income in lakhs");
        float income = sc.nextFloat();

        if(income<2.5f){
            tax=tax+0;
        }
        else if(income>2.5f  && income<5.0f){
            tax = tax + 0.05f*(income - 2.5f);
            
        }
        else if (income >5.0f && income<10.0f){
            tax = tax +0.05f*(5.0f -2.5f);
            tax= tax+ 0.2f*(income - 2.5f);
        
        }
        else if (income>10.0f){
            tax = tax+ 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f *(10.0f-5f);
            tax = tax + 0.3f *(income - 10.0f);
        }
         System.out.println(" total tax will be "+ tax);



    }
}*/

//Questionn 4>>>>
/*import java.util.Scanner;
public class practiceset4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("mondayy");
            case 2 -> System.out.println("tuesdayy");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("fridayy");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sundayy");
            default -> System.out.println("give correct no.");

            
            
        }
    }
}*/

//Questionnn 6>>>>
/*import java.util.Scanner;
public class practiceset4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter website");
        String website= sc.next();
        if(website.endsWith("com")){
            System.out.println("it is commercial website");
        }
         else if(website.endsWith("org")){
            System.out.println("it is organisation website");
        }
         else if(website.endsWith(".in")){
                System.out.println("it is indian website");
            }
                
    }

}*/
