package Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        if (!fruits.isEmpty()) {
            if (!fruits.get(0).getClass().equals(fruit.getClass())) {
                throw new IllegalArgumentException("Cannot add different types of fruits to the same box.");
            }
        }
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transfer(Box<T> otherBox) {
        if (otherBox == this) {
            return;
        }

        if (!otherBox.fruits.isEmpty() && !this.fruits.isEmpty() &&
                !otherBox.fruits.get(0).getClass().equals(this.fruits.get(0).getClass())) {
            throw new IllegalArgumentException("Cannot transfer to a box with different fruit types.");
        }

        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public int getSize() {
        return this.fruits.size();
    }
}
