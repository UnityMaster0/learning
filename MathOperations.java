import java.util.Scanner;

public class MathOperations {
    
    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Return NaN (Not-a-Number) for division by zero
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            // Input two numbers from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            // Perform multi-step math operations
            double sum = add(num1, num2);
            double difference = subtract(num1, num2);
            double product = multiply(num1, num2);
            double quotient = divide(num1, num2);
            
            // Output the results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            
            // Ask if the user wants to continue or exit
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.next();
            
            if (choice.equalsIgnoreCase("no")) {
                exit = true;
            }
        }
        
        scanner.close();
    }
}
