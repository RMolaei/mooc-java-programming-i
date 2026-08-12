/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Molaei
 */
public class Recipes {

    private final Recipe[] recipes;

    public Recipes(String fileName) {
        ArrayList<Recipe> recipeList = new ArrayList<>();
        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.equals("")) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipeList.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
        this.recipes = new Recipe[recipeList.size()];
        for (int index = 0; index < recipeList.size(); index++) {
            this.recipes[index] = recipeList.get(index);
        }
    }

    public void list() {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void findName (String word) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime (int time) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient (String word) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            ArrayList<String> ingredients = recipe.getIngredient();
            for (String ingredient : ingredients) {
                if (ingredient.equals(word)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }
}
