import java.util.Random;
//RA2211003010054
class NumuberGenerator054 extends Thread {
    public void run() {
        Random rand = new Random();
        while (true) {
            int num = rand.nextInt(100);
            System.out.println("Generated: " + num);
            if (num % 2 == 0) {
                SquareThread squareThread = new SquareThread(num);
                squareThread.start();
            }
            else {
                CubeThread cubeThread = new CubeThread(num);
                cubeThread.start();
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class SquareThread extends Thread {
    private int num;
    public SquareThread(int num) {
        this.num = num;
    }
    public void run() {
        int square = num * num;
        System.out.println("Square: " + square);
    }
}
class CubeThread extends Thread {
    private int num;
    public CubeThread(int num) {
        this.num = num;
    }
    public void run() {
        int cube = num * num * num;
        System.out.println("Cube: " + cube);
    }
}
public class APP_T7_P1 {
    public static void main(String[] args) {
        NumuberGenerator054 numberGenerator = new NumuberGenerator054();
        numberGenerator.start();
    }
}