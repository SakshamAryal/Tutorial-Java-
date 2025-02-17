import java.util.Random;
import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int randomnum = random.nextInt(0, 101);
        int attempts = 1;

        System.err.print("Guess a number between 0-100: ");
        guess = scanner.nextInt();

        while (guess != randomnum) {
            System.out.println("Wrong guess!");
            System.err.print("Guess a number between 0-100: ");
            guess = scanner.nextInt();
            attempts += 1;
        }
        System.out.println("You took " + attempts + " attempts to guess the number.");
        scanner.close();
    }
}
