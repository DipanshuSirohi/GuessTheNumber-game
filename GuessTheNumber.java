import java.util.Scanner;
import java.math.*;


public class GuessTheNumber {
    public static void Game(){
        Scanner sc =new Scanner(System.in);
        int num = 1+ (int)(100*Math.random());
        int K = 5;
        System.out.print("Choose a numer between 1 to 100. ");
        System.out.println("You have only " + K + " attempts to guess the correct one.");
        for(int i = 0; i<K; i++){
            System.out.println("Enter Your guess number:");
            int guess = sc.nextInt();
            if(guess == num){
                System.out.println("Congratulation!. You Won");
                return;

            }else if (guess < num) {
                System.out.println("The number is gretern " + guess + "  Try again!");
                
            } else  {
                System.out.println("The Number is less then " + guess + "  Try again!");
                
            }

        }
        System.out.println(" You Loss!. The correct number is " + num);
        sc.close();
    }
    public static void main( String[] agrs){
        Game();

    }

        

    
    
}
