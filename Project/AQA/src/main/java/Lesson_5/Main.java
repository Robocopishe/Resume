package Lesson_5;



public class Main {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + java.util.Arrays.toString(numbers));
        ArraySwapper.swap(numbers, 0, 4);
        System.out.println("After swap: " + java.util.Arrays.toString(numbers));


        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();

        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());

        System.out.println("appleBox1 and appleBox2 are equal: " + appleBox1.compare(appleBox2));

        appleBox1.transfer(appleBox2);

        System.out.println("After transfer:");
        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("appleBox2 and orangeBox are equal: " + appleBox2.compare(orangeBox));

        try {
            appleBox2.addFruit(new Orange());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
