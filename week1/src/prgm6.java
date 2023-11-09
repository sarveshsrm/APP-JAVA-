import java.util.Scanner;
public class prgm6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password_054 = scanner.nextLine();

        if (isValidPassword(password_054)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password. Please follow the password guidelines.");
        }
    }

    public static boolean isValidPassword(String password_054) {

        String lowercaseRegex = ".*[a-z].*";
        String uppercaseRegex = ".*[A-Z].*";
        String numberRegex = ".*\\d.*";
        String specialCharRegex = ".*[$#@].*";
        String lengthRegex = ".{6,16}";
        boolean hasLowercase = password_054.matches(lowercaseRegex);
        boolean hasUppercase = password_054.matches(uppercaseRegex);
        boolean hasNumber = password_054.matches(numberRegex);
        boolean hasSpecialChar = password_054.matches(specialCharRegex);
        boolean hasValidLength = password_054.matches(lengthRegex);

        return hasLowercase && hasUppercase && hasNumber && hasSpecialChar && hasValidLength;
    }
}
