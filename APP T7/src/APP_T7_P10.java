//RA2211003010054
class MyThread054 extends Thread {
    public MyThread054(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}
public class APP_T7_P10 {
    public static void main(String[] args) {
        MyThread054 thread1 = new MyThread054("Thread 1");
        MyThread054 thread2 = new MyThread054("Thread 2");
        MyThread054 thread3 = new MyThread054("Thread 3");
        MyThread054 thread4 = new MyThread054("Thread 4");
        MyThread054 thread5 = new MyThread054("Thread 5");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread4.setPriority(7);
        thread5.setPriority(3);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
