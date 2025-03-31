package Lesson_4;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            System.out.println("Decreased food by " + amount + ". Remaining: " + foodAmount);
        } else {
            System.out.println("Not enough food in the bowl.");
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("Added " + amount + " food. Total: " + foodAmount);
    }
}
