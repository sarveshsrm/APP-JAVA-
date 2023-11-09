public class TrafficLight054 {
    private String color;
    private int durationInSeconds;
    public TrafficLight054(String color, int durationInSeconds) {
        this.color = color;
        this.durationInSeconds = durationInSeconds;
    }
    public void changeColor054(String newColor) {
        this.color = newColor;
    }
    public boolean isRed054() {
        return color.equalsIgnoreCase("red");
    }
    public boolean isGreen054() {
        return color.equalsIgnoreCase("green");
    }
    public String getColor054() {
        return color;
    }
    public int getDurationInSeconds054() {
        return durationInSeconds;
    }
    public static void main(String[] args) {
        TrafficLight054 trafficLight = new TrafficLight054("red", 30);
        System.out.println("Current Color: " + trafficLight.getColor054());
        System.out.println("Duration: " + trafficLight.getDurationInSeconds054() + " seconds");
        trafficLight.changeColor054("green");
        System.out.println("New Color: " + trafficLight.getColor054());
        if (trafficLight.isRed054()) {
            System.out.println("The traffic light is red.");
        } else if (trafficLight.isGreen054()) {
            System.out.println("The traffic light is green.");
        }
    }
}
