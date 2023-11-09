import java.util.Scanner;
import java.util.Random;
public class prgm2 {
    public static void main(String[] args) {
        Random random_054 = new Random();
        int secretNumber_054 = random_054.nextInt(9) + 1;
        Scanner scanner_054 = new Scanner(System.in);
        int guess_054;
        do {
            System.out.print("Guess a number between 1 and 9: ");
            guess_054 = scanner_054.nextInt();

            if (guess_054== secretNumber_054) {
                System.out.println("Well guessed!");
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        } while (guess_054 != secretNumber_054);
    }
}
