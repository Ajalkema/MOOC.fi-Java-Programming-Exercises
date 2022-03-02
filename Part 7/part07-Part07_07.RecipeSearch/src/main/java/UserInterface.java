import java.nio.file.Paths;
import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        this.recipes = openFileReturnRecipes(file);

        System.out.println("");

        System.out.println("Commands:");
        System.out.println("list - lists the recipes:");
        System.out.println("stop - stops the program:");
        System.out.println("find name - searches recipes by name:");
        System.out.println("find cooking time - searches recipes by cooking time:");
        System.out.println("find ingredient - searches recipes by ingredient:");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");

            if (command.equals("stop")) break;

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("list")) {
            for (Recipe r : recipes) {
                System.out.println(r);
            }
        }
        if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String searchedWord = scanner.nextLine();
            findName(searchedWord);
        }
        if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int maxCookingTime = Integer.valueOf(scanner.nextLine());
            findMaxCookingTime(maxCookingTime);
        }
        if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String searchedIngredient = scanner.nextLine();
            findIngredient(searchedIngredient);
        }
    }

    public void findName(String searchedWord) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

    public void findMaxCookingTime(int maxCookingTime){
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String searchedIngredient) {
        for (Recipe recipe : recipes) {
            for (String ingr : recipe.getIngredients()) {
                if (ingr.equals(searchedIngredient)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }

    public ArrayList<Recipe> openFileReturnRecipes(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);

                recipes.add(recipe);

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.equals("")) break;

                    recipe.addIngredient(ingredient);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return recipes;
    }
}
