import java.util.Scanner;

public class EmployeeInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        
        // Create arrays to store employee information
        String[] names = new String[numEmployees];
        int[] ages = new int[numEmployees];
        double[] salaries = new double[numEmployees];
        
        // Input employee information
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee #" + (i + 1) + ":");
            
            System.out.print("Name: ");
            names[i] = scanner.next();
            
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Salary: ");
            salaries[i] = scanner.nextDouble();
        }
        
        // Print employee information
        System.out.println("\nEmployee Information:");
        System.out.println("-------------------------------");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Salary: $" + salaries[i]);
            System.out.println();
        }
        
        scanner.close();
    }
}
