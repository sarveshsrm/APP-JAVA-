//RA2211003010054
class MySleepThread054 extends Thread {
    private int sleepDuration;
    public MySleepThread054(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }
    public void run() {
        try {
            System.out.println(getName() + " is sleeping for " + sleepDuration + " milliseconds.");
            Thread.sleep(sleepDuration);
            System.out.println(getName() + " has finished sleeping.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class APP_T7_P9 {
    public static void main(String[] args) {
        MySleepThread054 thread1 = new MySleepThread054(10);
        MySleepThread054 thread2 = new MySleepThread054(20);
        MySleepThread054 thread3 = new MySleepThread054(50);
        MySleepThread054 thread4 = new MySleepThread054(70);
        MySleepThread054 thread5 = new MySleepThread054(100);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
