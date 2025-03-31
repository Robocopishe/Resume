package Lesson_4;

public class Main {

    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        Cat catBarsik = new Cat("Barsik");
        Cat catMurka = new Cat("Murka");

        dogBobik.run(400);
        dogBobik.swim(5);
        catBarsik.run(150);
        catBarsik.swim(5);

        System.out.println("Total animals: " + Animal.getAnimalCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
        System.out.println("Total cats: " + Cat.getCatCount());

        Bowl bowl = new Bowl(50);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Whiskers");
        cats[1] = new Cat("Snowball");
        cats[2] = new Cat("Garfield");

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("\nCat Fullness:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " is full: " + cat.isFull());
        }

        bowl.addFood(30);

        Payment payment = new Payment();
        Payment.Purchase purchase = payment.createNewPurchase();
        purchase.addItem("Shirt", 25.00);
        purchase.addItem("Pants", 40.00);
        purchase.displayPurchase();

        Park park = new Park();
        Park.Attraction attraction = park.createAttraction("Roller Coaster", "10:00 - 22:00", 5.00);
        attraction.displayAttractionInfo();
    }
}
