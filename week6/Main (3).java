interface Resizable054 {
    void resizeWidth054(int width);
    void resizeHeight054(int height);
}
class Rectangle054 implements Resizable054 {
    private int width;
    private int height;

    public Rectangle054(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth054(int width) {
        this.width = width;
    }
    @Override
    public void resizeHeight054(int height) {
        this.height = height;
    }
    public void display054() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle054 rectangle = new Rectangle054(5, 7);
        System.out.println("Original Dimensions:");
        rectangle.display054();
        rectangle.resizeWidth054(8);
        rectangle.resizeHeight054(10);
        System.out.println("\nDimensions after resizing:");
        rectangle.display054();
    }
}

