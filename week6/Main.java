class Shape054 {
    public double getPerimeter054() {
        return 0.0; 
    }
    public double getArea054() {
        return 0.0; 
    }
}
class Circle054 extends Shape054 {
    private double radius;
    public Circle054(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter054() {
        return 2 * Math.PI * radius; 
    }
    @Override
    public double getArea054() {
        return Math.PI * radius * radius; 
    }
}
public class Main {
    public static void main(String[] args) {
        Circle054 circle = new Circle054(5.0);
        System.out.println("Circle Radius: " + circle.getPerimeter054());
        System.out.println("Circle Perimeter: " + circle.getPerimeter054());
        System.out.println("Circle Area: " + circle.getArea054());
    }
}


