// Import java packages
import java.util.Arrays;
import java.util.Scanner;

// Main class

public class Main {

    // Create scanner and running
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    private static RecipeBox recipeBox = new RecipeBox();

    public static void main(String[] args) {

        // Add in recipe box objects

        // 1. Classic Breakfast Waffles
        recipeBox.addRecipe(new Recipe(
            "Classic Waffles", 
            Arrays.asList("Flour", "Sugar", "Baking Powder", "Eggs", "Milk", "Butter"), 
            "Breakfast", "Waffle Iron", 15.0
        ));

        // 2. Quick Spicy Ramen
        recipeBox.addRecipe(new Recipe(
            "Spicy Ramen", 
            Arrays.asList("Ramen Noodles", "Sriracha", "Egg", "Green Onions", "Soy Sauce"), 
            "Lunch", "Stovetop", 10.0
        ));

        // 3. Garlic Butter Salmon
        recipeBox.addRecipe(new Recipe(
            "Garlic Butter Salmon", 
            Arrays.asList("Salmon Fillet", "Garlic", "Butter", "Lemon", "Parsley"), 
            "Dinner", "Oven", 20.0
        ));

        // 4. Avocado Toast
        recipeBox.addRecipe(new Recipe(
            "Avocado Toast", 
            Arrays.asList("Sourdough Bread", "Avocado", "Red Pepper Flakes", "Lemon Juice"), 
            "Snack", "Toaster", 5.0
        ));

        while (running) {
            showMainMenu();
        }
    }

    // Main menu interface method
    private static void showMainMenu() {

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