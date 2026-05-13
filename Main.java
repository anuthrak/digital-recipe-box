// Import java packages
import java.util.Scanner;

// Main class

public class Main {

    // Create scanner and running
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    public static void main(String[] args) {

        while (running) {
            showMainMenu();
        }
    }

    // M
    private static void showMainMenu() {

        // Main Menu User Interface
        System.out.println("\n/---------- DIGICIPIE v1.0 ----------\\");
        System.out.println("|                                    |");
        System.out.println("|  1. Add a Recipe                   |");
        System.out.println("|  2. Remove a Recipe                |");
        System.out.println("|  3. Search for Recipes             |");
        System.out.println("|  4. Cook With Me!                  |");
        System.out.println("|  5. View a Recipe                  |");
        System.out.println("|  6. View Favorite Recipes          |");
        System.out.println("|  7. Exit                           |");
        System.out.println("|                                    |");
        System.out.println("\\------------------------------------/");
        
        System.out.print("Enter Selection [1-7]: ");

        // Wrap input in try-catch to handle non-integer inputs
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            handleMenuChoice(choice);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    // Method for handling menu choices
    private static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                // code to add a recipe
                break;
            case 2:
                // code to remove a recipe
                break;
            case 3:
                // code to search for recipes
                break;
            case 4:
                // code for cook with me feature
                break;
            case 5:
                // code to view a recipe
                break;
            case 6:
                // code to view favorite recipes
                break;
            case 7:
                System.out.println("Thank you for using Digi-Cipie! Goodbye!");
                running = false;
                break;

            // Invalid number outside of 1-7
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
    
}