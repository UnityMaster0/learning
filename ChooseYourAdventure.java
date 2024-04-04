import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Choose Your Own Adventure game!");
        System.out.println("You are standing in front of a mysterious cave. Do you want to enter? (yes/no)");
        
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("You entered the cave. It's dark and eerie.");
            System.out.println("You see two paths ahead of you. Which one do you choose? (left/right)");
            choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("left")) {
                System.out.println("You chose the left path. You found a treasure chest! You win!");
            } else if (choice.equalsIgnoreCase("right")) {
                System.out.println("You chose the right path. You encounter a hungry bear and get eaten. Game over!");
            } else {
                System.out.println("Invalid choice. You stand still and nothing happens. Game over!");
            }
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("You decide not to enter the cave. You go home and live a normal life. Game over!");
        } else {
            System.out.println("Invalid choice. You stand still and nothing happens. Game over!");
        }
        
        scanner.close();
    }
}
