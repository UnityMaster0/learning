public class DogRunner {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog1 = new Dog("Buddy", "Golden Retriever", 3, true);

        // Display information about the dog
        System.out.println("Information about Dog 1:");
        dog1.displayInfo();
        System.out.println();

        // Make the dog bark
        System.out.print("Making Dog 1 bark: ");
        dog1.bark();
        System.out.println();

        // Create another Dog object
        Dog dog2 = new Dog("Max", "German Shepherd", 5, true);

        // Display information about the second dog
        System.out.println("Information about Dog 2:");
        dog2.displayInfo();
        System.out.println();

        // Make the second dog bark
        System.out.print("Making Dog 2 bark: ");
        dog2.bark();
    }
}
