package Lesson_4;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= 10) {
            bowl.decreaseFood(10);
            this.isFull = true;
            System.out.println(name + " ate and is now full.");
        } else {
            System.out.println(name + " didn't eat (not enough food).");
        }
    }
}