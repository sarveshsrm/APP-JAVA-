public class APP_T7_P5 {
    public static void main(String[] args) {
        MyUserThread054 userThread = new MyUserThread054();
        userThread.start();
        Thread mainThread = new Thread(() -> {
            try {
                System.out.println("Main Thread started.");
                Thread.sleep(1000);
                System.out.println("Main Thread finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        mainThread.start();
        try {
            userThread.join();
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Both threads have finished.");
    }
    static class MyUserThread054 extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("User Thread started.");
                Thread.sleep(1000);
                System.out.println("User Thread finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
