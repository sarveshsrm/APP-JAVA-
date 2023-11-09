import java.util.LinkedList;
class SharedBuffer {
    private LinkedList<Integer> buffer054;
    private int capacity054;
    public SharedBuffer(int capacity) {
        this.capacity054 = capacity;
        buffer054 = new LinkedList<>();
    }
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer054.size() == capacity054) {
            wait();
        }
        buffer054.add(item);
        System.out.println("Produced: " + item);
        notify();
    }
    public synchronized int consume() throws InterruptedException {
        while (buffer054.isEmpty()) {
            wait();
        }
        int item = buffer054.remove();
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}
class Producer implements Runnable {
    private SharedBuffer buffer054;

    public Producer(SharedBuffer buffer) {
        this.buffer054 = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer054.produce(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer implements Runnable {
    private SharedBuffer buffer;
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                int item = buffer.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class APP_T7_P2 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
    }
}