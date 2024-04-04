public class Dog {
    // Instance variables
    private String name;
    private String breed;
    private int age;
    private boolean isMale;

    // Constructor
    public Dog(String name, String breed, int age, boolean isMale) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isMale = isMale;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " says Woof!");
    }

    // Method to display information about the dog
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (isMale ? "Male" : "Female"));
    }
}
