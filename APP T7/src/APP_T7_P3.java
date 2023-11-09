//RA2211003010054
public class APP_T7_P3 {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                Thread.currentThread().setName("NewThreadName");
                System.out.println("Thread name changed to: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Original Thread name: " + myThread.getName());
        myThread.start();
    }
}
