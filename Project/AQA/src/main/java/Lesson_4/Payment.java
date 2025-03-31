package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    public class Purchase {
        private List<String> items = new ArrayList<>();
        private double totalCost = 0;

        public void addItem(String item, double price) {
            items.add(item);
            totalCost += price;
        }

        public void displayPurchase() {
            System.out.println("Purchase details:");
            for (String item : items) {
                System.out.println("- " + item);
            }
            System.out.println("Total cost: " + totalCost);
        }
    }

    public Purchase createNewPurchase() {
        return new Purchase();
    }
}
