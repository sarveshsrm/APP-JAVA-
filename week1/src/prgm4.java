import java.util.Scanner;

public class prgm4 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word_054 = scanner_054.next();

        String reversedWord_054 = reverseString(word_054);
        System.out.println("Reversed word: " + reversedWord_054);

        scanner_054.close();
    }

    public static String reverseString(String input) {
        char[] charArray_054 = input.toCharArray();
        int left_054= 0;
        int right_054 = charArray_054.length - 1;

        while (left_054 < right_054) {
            char temp_054 = charArray_054[left_054];
            charArray_054[left_054] = charArray_054[right_054];
            charArray_054[right_054] = temp_054;
            left_054++;
            right_054--;
        }

        return new String(charArray_054);
    }
}
