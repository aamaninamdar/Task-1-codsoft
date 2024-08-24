import java.util.Random;
import java.util.Scanner;

public class t_p5 {
    public static void main(String[] args) {
        // instances of Random and Scanner 
        Random random = new Random();
        Scanner sn = new Scanner(System.in);
       int GuessN=0;
        // Generate a random number between 1 and 100
        int rn = random.nextInt(100) + 1;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 5 attempts to guess the number.");

        int Attempt=0;
        
        // use the While loop 
        while (GuessN != rn && Attempt < 5 )
        {
            // Prompt the user to enter their guess
        System.out.print("Enter your guess (1 to 100): ");
        GuessN = sn.nextInt();
        Attempt++;
        
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
        if (GuessN!= rn) {
            int attemptsLeft = 5 - Attempt;
            if (attemptsLeft > 0) {
                System.out.println("You have " + attemptsLeft + " attempts left.");
            } else {
                System.out.println("You have run out of attempts.");
            }
        }
    }
       
    }
}
