import java.util.Random;
import java.util.Scanner;

public class t_p3 {
    public static void main(String[] args) {
        // instances of Random and Scanner 
        Random random = new Random();
        Scanner sn = new Scanner(System.in);
        
        // Generate a random number between 1 and 100
        int rn = random.nextInt(100) + 1;
        
        // Prompt the user to enter their guess
        System.out.print("Enter your guess (1 to 100): ");
        int GuessN = sn.nextInt();
        
        // Check if the user's guess is correct
        if (GuessN == rn) {
            System.out.println("Congratulations! You guessed the correct number: " + rn);
        } else if(GuessN > rn){
            System.out.println(" Number is too high :"+ GuessN);
        }
        else if (GuessN < rn)
        {
            System.out.println("Number is too low :"+ GuessN);
        }
        else {
            System.out.println("Sorry, the correct number was: " + rn);
        }
        
       
    }
}
