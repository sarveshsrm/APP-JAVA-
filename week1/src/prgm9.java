import java.util.Scanner;
public class prgm9 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner_054.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner_054.nextInt();
        int result = getSumOr200(num1, num2);
        System.out.println("Result: " + result);
    }
    public static int getSumOr200(int a, int b) {
        int sum_054 = a + b;
        if (sum_054 >= 105 && sum_054 <= 200) {
            return 200;
        } else {
            return sum_054;
        }
    }
}
