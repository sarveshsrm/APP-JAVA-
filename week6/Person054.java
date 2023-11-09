public class Person054 {
    private static int nextId = 1; 
    private int id;
    private String name;
    private int age;

    public Person054(String name, int age) {
        this.id = nextId++; 
        this.name = name;
        this.age = age;
    }

    public int getId054() {
        return id;
    }

    public String getName054() {
        return name;
    }

    // Getter method for age
    public int getAge054() {
        return age;
    }

    public static void main(String[] args) {
        
        Person054 person1 = new Person054("Alice", 25);
        Person054 person2 = new Person054("Bob", 30);

        System.out.println("Person 1 - ID: " + person1.getId054() + ", Name: " + person1.getName054() + ", Age: " + person1.getAge054());

        System.out.println("Person 2 - ID: " + person2.getId054() + ", Name: " + person2.getName054() + ", Age: " + person2.getAge054());
    }
}
