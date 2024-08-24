import java.util.Random;
import java.util.Scanner;

public class t_p7
 {
    public static void main(String[] args) {

        // instances of Random and Scanner 
        Random random = new Random();
        Scanner sn = new Scanner(System.in);

            int totalA = 0;  // Total number of attempts made
            boolean playAgain = true;
             int r = 0;  // Number of rounds won

        while(playAgain)
        {
            int GuessN=0;
            int rn = random.nextInt(100) + 1;
            int Attempt=0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 5 attempts to guess the number.");

        
        // use the While loop 
        while (GuessN != rn && Attempt < 5 )
          {
            // Prompt the user to enter their guess
        System.out.print("Enter your guess (1 to 100): ");
        GuessN = sn.nextInt();
        Attempt++;
        totalA++;
        
        // Check if the user's guess is correct
        if (GuessN == rn) 
        {
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
        if (GuessN!= rn)
        {
            int attemptsLeft = 5 - Attempt;
            if (attemptsLeft > 0) {
                System.out.println("You have " + attemptsLeft + " attempts left.");
            } else {
                System.out.println("You have run out of attempts.");
            }
        }
    }
   
    if (GuessN == rn) {
        System.out.println("Sorry, you didn't guess the number. The correct number was " + rn + ".");
        r++;
    }
    else {
        System.out.println("Sorry, you didn't guess the number. The correct number was " + rn + ".");
    }

    // Ask the user if they want to play another round
    System.out.print("Do you want to play again? (yes/no): ");
    String response = sn.next();
    playAgain = response.equalsIgnoreCase("yes");

    if (playAgain) {
        System.out.println("Starting a new round...");
    } else {
             // Display the final score
                System.out.println("Thank you for playing! Goodbye.");
                System.out.println("Your final score:");
                System.out.println("Rounds Won: " + r);
                System.out.println("Total Attempts: " + totalA);
    }
}
       
    }
}
