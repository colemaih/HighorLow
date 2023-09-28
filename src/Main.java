import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int number = random.nextInt(10) + 1;

        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");

            guess = input.nextInt();

            if (guess < 1 || guess > 10) {

                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } while (guess < 1 || guess > 10);

        input.close();

        System.out.println("The random number is " + number + ".");
        if (guess == number) {
            System.out.println("You guessed it right!");
        } else if (guess < number) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }
    }
}