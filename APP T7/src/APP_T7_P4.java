//RA2211003010054
public class APP_T7_P4 {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            for (int i = 5; i >= 1; i--) {
                try {
                    Thread.sleep(6000);
                    Thread.currentThread().setName("Thread-" + i);
                    System.out.println("Thread name changed to: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        myThread.start();
    }
}
