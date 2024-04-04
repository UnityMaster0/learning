import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Output "Hello, World!"
        System.out.println("Hello, World!");
        
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the user's name
        System.out.print("Please enter your name: ");
        
        // Read the user's name from the console input
        String name = scanner.nextLine();
        
        // Output "Hello" followed by the person's name
        System.out.println("Hello, " + name + "!");
        
        // Close the Scanner object to release resources
        scanner.close();
    }
}