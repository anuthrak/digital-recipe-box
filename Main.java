// Import java packages
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

// Main class

public class Main {

    // Create a recipe box
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    public static void main(String[] args) {

        while (running) {
            showMainMenu();
        }
    }

    private static void showMainMenu() {
        System.out.println("--- Welcome to Digi-Cipie ---");
        System.out.println("1. Add a recipe");
        System.out.println("2. Remove a recipe");
        System.out.println("3. Search for recipes");
        System.out.println("4. Cook with me!");
        System.out.println("5. View a recipe");
        System.out.println("6. View favorite recipes");
        System.out.println("7. Exit");
        System.out.print("Please select an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        handleMenuChoice(choice);
    }

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
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
    
}