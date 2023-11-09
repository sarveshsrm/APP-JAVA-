import java.util.concurrent.Semaphore;
//RA2211003010054
class Printer {
    private Semaphore semaphore054 = new Semaphore(1);
    public void printJob(int jobId) {
        try {
            semaphore054.acquire();
            System.out.println("Printing job #" + jobId);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore054.release();
        }
    }
}
class PrintJob implements Runnable {
    private Printer printer054;
    private int jobId054;
    public PrintJob(Printer printer, int jobId) {
        this.printer054 = printer;
        this.jobId054 = jobId;
    }
    public void run() {
        printer054.printJob(jobId054);
    }
}
public class APP_T7_P6 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new PrintJob(printer, i + 1));
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All jobs have been printed.");
    }
}















