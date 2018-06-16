package design.object.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Receiver class in terms of Command design pattern
 */
public class Kitchen {
    private final List<String> food;

    public Kitchen() {
        // no sense without food =)
        this.food = new ArrayList<>();
    }

    /**
     * Returns all food which is stored in the kitchen
     */
    public List<String> getFood() {
        return food;
    }

    /**
     * Searches for required {@code food}
     */
    public String getFood(String food) {
        String foundFood = this.food
                .stream()
                .filter(storedFood -> Objects.equals(food, storedFood))
                .findFirst()
                .orElse(null);
        if (foundFood != null) {
            this.food.remove(foundFood);
        }
        return foundFood;
    }

    /**
     * Adds food to be stored in the kitchen
     */
    public void addFood(String food) {
        this.food.add(food);
    }

    /**
     * Cleans kitchen
     */
    public void clean() {
        System.out.println("Cleaning kitchen");
    }
}
