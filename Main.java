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

        // Print initial main menu
        printMainMenu();

        while (running) {
            showMainMenu();
        }
    }

    // Main menu interface method
    private static void showMainMenu() {
        
        System.out.print("Enter Selection [1-8]: ");

        // Wrap input in try-catch to handle non-integer inputs
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            handleMenuChoice(choice);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 8.");
            scanner.nextLine(); // Clear the invalid input
        }
    }


    // Method to print the main menu
    public static void printMainMenu() {

            System.out.println("\n/---------- DIGICIPIE v1.0 ----------\\");
            System.out.println("|                                    |");
            System.out.println("|  1. Add a Recipe                   |");
            System.out.println("|  2. Remove a Recipe                |");
            System.out.println("|  3. Show all Recipes               |");
            System.out.println("|  4. Search for Recipes             |");
            System.out.println("|  5. Cook With Me!                  |");
            System.out.println("|  6. View a Recipe                  |");
            System.out.println("|  7. View Favorite Recipes          |");
            System.out.println("|  8. Exit                           |");
            System.out.println("|                                    |");
            System.out.println("\\------------------------------------/");

        }

    // Method for handling menu choices
    private static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                // Add recipe code
                System.out.println("\n--- ADD A RECIPE ---\n");

                String recipeName;
                while (true) {
                    System.out.print("Enter the name of the recipe: ");
                    recipeName = scanner.nextLine().trim();

                    if (recipeName.isEmpty()) {
                        System.out.println("Recipe name cannot be empty. Please enter a name.");
                        continue;
                    }

                    if (recipeBox.recipeExists(recipeName)) {
                        System.out.println("A recipe named \"" + recipeName + "\" already exists. Please choose a different name.");
                        continue;
                    }

                    break;
                }

                System.out.print("Enter the ingredients (comma-separated): ");
                String ingredientsInput = scanner.nextLine(); 
                String[] ingredients = ingredientsInput.split(",");
                System.out.println("Breakfast | Lunch | Dinner | Snack | etc.");
                System.out.print("Enter the category: "); 
                String category = scanner.nextLine(); 
                System.out.println("Oven | Stovetop | Microwave | No-Cook | etc.");
                System.out.print("Enter the cook method: ");
                String cookMethod = scanner.nextLine();
                System.out.print("Enter the cook time (in minutes): ");
                double cookTime = scanner.nextDouble();

                Recipe newRecipe = new Recipe(recipeName, Arrays.asList(ingredients), category, cookMethod, cookTime);
                recipeBox.addRecipe(newRecipe);

                // Confirmation message!
                System.out.println("\nAdding " + recipeName + " to your recipe box...");
                System.out.println("Done! Returning to main menu...");

                scanner.nextLine(); // Clear the newline character

                printMainMenu();
                break;
            case 2:
                // Remove recipe code
                System.out.println("\n--- REMOVE A RECIPE ---\n");
                System.out.print("Enter the name of the recipe you want to remove: ");
                String recipeToRemove = scanner.nextLine();
        
                recipeBox.removeRecipe(recipeToRemove);

                // Print main menu again after removing recipe
                System.out.println("Done! Returning to main menu...");
                printMainMenu(); 
                break;
            case 3:
                // code to show all recipes
                recipeBox.shortList();
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
                // code to exit
                break;
            case 8:
                System.out.println("Thank you for using Digi-Cipie! Goodbye!");
                running = false;
                break;

            // Invalid number outside of 1-8
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
    
}