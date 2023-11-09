import java.util.Scanner;
//RA2211003010054
class UserThreadPriority054 extends Thread {
    private String k;
    private char c;
    public UserThreadPriority054(String name) {
        super(name);
    }
    public void setValues054(String k, char c) {
        this.k = k;
        this.c = c;
    }
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
        System.out.println("Value of k: " + k);
        System.out.println("Value of c: " + c);
    }
}
public class APP_T7_P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserThreadPriority054 threadobj1 = new UserThreadPriority054("ThreadA");
        UserThreadPriority054 threadobj2 = new UserThreadPriority054("ThreadB");
        System.out.print("Enter a string (k): ");
        String userInputK = scanner.nextLine();
        System.out.print("Enter a character (c): ");
        char userInputC = scanner.next().charAt(0);
        threadobj1.setValues054(userInputK, userInputC);
        threadobj2.setValues054(userInputK, userInputC);
        threadobj1.start();
        threadobj2.start();
    }
}
