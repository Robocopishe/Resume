package Lesson_4;

public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " couldn't run " + distance + " meters. Limit: " + runLimit);
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " can't swim.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " couldn't swim " + distance + " meters. Limit: " + swimLimit);
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}