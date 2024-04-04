public class Pointer {
    public static void main(String[] args) {
        // Creating two objects of type Person
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        // Assigning the reference of person2 to person1
        Person pointer = person1;
        
        // Modifying person1 through the pointer
        pointer.setName("Bob");

        // Accessing person1 and person2
        System.out.println("Person 1: " + person1.getName()); // Output: Bob
        System.out.println("Person 2: " + person2.getName()); // Output: Alice
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
