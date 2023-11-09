interface Flyable054 {
    void fly_obj054();
}
class Spacecraft054 implements Flyable054 {
    @Override
    public void fly_obj054() {
        System.out.println("Spacecraft is flying in space.");
    }
}
class Airplane054 implements Flyable054 {
    @Override
    public void fly_obj054() {
        System.out.println("Airplane is flying in the sky.");
    }
}
class Helicopter054 implements Flyable054 {
    @Override
    public void fly_obj054() {
        System.out.println("Helicopter is flying in the air.");
    }
}
public class Main {
    public static void main(String[] args) {
        Flyable054 spacecraft = new Spacecraft054();
        Flyable054 airplane = new Airplane054();
        Flyable054 helicopter = new Helicopter054();
        System.out.println("Flying Objects:");
        spacecraft.fly_obj054();
        airplane.fly_obj054();
        helicopter.fly_obj054();
    }
}


