import java.util.Random;

public class t_p1  {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomN = random.nextInt(100) + 1;
        
        // Print the random number
        System.out.println("Random number between 1 and 100: " + randomN);
    }
}