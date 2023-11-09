public class APP_T7_P7 {
    public static void main(String[] args) {
        String k054 = "Hello123World456";
        Thread threadA = new Thread(new ThreadA(k054));
        threadA.start();
        Thread threadB = new Thread(new ThreadB(k054));
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class ThreadA implements Runnable {
    private String k054;

    public ThreadA(String k054) {
        this.k054 = k054;
    }
    public void run() {
        int dc = 0;
        for (char c : k054.toCharArray()) {
            if (Character.isDigit(c)) {
                dc++;
            }
        }
        System.out.println("ThreadA:" + dc + " digits count");
    }
}
class ThreadB implements Runnable {
    private String k054;
    public ThreadB(String k054) {
        this.k054 = k054;
    }
    public void run() {
        int cc = 0;
        for (char c : k054.toCharArray()) {
            if (Character.isLetter(c)) {
                cc++;
            }
        }
        System.out.println("ThreadB:" + cc + " alphabetic count");
    }
}















