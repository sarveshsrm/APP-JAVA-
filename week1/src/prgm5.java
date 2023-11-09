import java.util.Scanner;

public class prgm5 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input_054 = scanner_054.nextLine();

        int digitCount_054 = 0;
        int letterCount_054 = 0;

        for (int i_054 = 0; i_054 < input_054.length(); i_054++) {
            char ch_054 = input_054.charAt(i_054);
            if (Character.isDigit(ch_054)) {
                digitCount_054++;
            } else if (Character.isLetter(ch_054)) {
                letterCount_054++;
            }
        }

        System.out.println("Number of digits: " + digitCount_054 +"\n" );
        System.out.println("Number of letters: " + letterCount_054);

        scanner_054.close();
    }
}

