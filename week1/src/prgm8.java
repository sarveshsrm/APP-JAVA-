import java.util.Scanner;
public class prgm8 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter the month name: ");
        String monthName_054 = scanner_054.nextLine();
        int numberOfDays_054 = getNumberOfDays(monthName_054);
        if (numberOfDays_054 != -1) {
            System.out.println("No.of days in " + monthName_054 + ": " + numberOfDays_054);
        } else {
            System.out.println("Invalid month name. Please enter a valid month name.");
        }
    }
    public static int getNumberOfDays(String monthName_054) {
        String lowercaseMonth = monthName_054.toLowerCase();
        switch (lowercaseMonth) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28; //
            default:
                return -1;
        }
    }
}
