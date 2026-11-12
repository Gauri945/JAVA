import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Stone , 1 for Paper , 2 for Scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if(userinput == computerinput){
            System.out.println("Draww");
        }
        else if((userinput == 0 && computerinput == 1 ) || (userinput == 1 && computerinput == 0 )|| (userinput == 2 && computerinput == 1)){
            System.out.println("You Winnn");
        }
        else {
            System.out.println("You loss");
        }
    }
    
}
