import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class RecipeBoxTest {
    private RecipeBox recipeBox;
    private Recipe testRecipe;

    @BeforeEach
    void setUp() {
        recipeBox = new RecipeBox();
        List<String> ingredients = Arrays.asList("Flour", "Sugar");
        List<String> instructions = Arrays.asList("Mix", "Bake");
        testRecipe = new Recipe("Pancakes", ingredients, "Breakfast", "Stovetop", 10.0, instructions);
    }

    @Test
    void testAddRecipe() {
        recipeBox.addRecipe(testRecipe);
        assertTrue(recipeBox.recipeExists("Pancakes"), "Recipe should exist after being added.");
    }

    @Test
    void testRecipeExistsCaseInsensitive() {
        recipeBox.addRecipe(testRecipe);
        assertTrue(recipeBox.recipeExists("pancakes"), "Search should be case-insensitive.");
    }

    @Test
    void testRemoveRecipe() {
        recipeBox.addRecipe(testRecipe);
        recipeBox.removeRecipe("Pancakes");
        assertFalse(recipeBox.recipeExists("Pancakes"), "Recipe should not exist after removal.");
    }

    @Test
    void testGetInvalidRecipe() {
        Recipe result = recipeBox.getRecipe("NonExistent");
        assertNull(result, "Getting a non-existent recipe should return null.");
    }
}