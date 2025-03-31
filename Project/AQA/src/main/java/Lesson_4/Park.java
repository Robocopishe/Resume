package Lesson_4;

public class Park {

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayAttractionInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

    public Attraction createAttraction(String name, String workingHours, double cost) {
        return new Attraction(name, workingHours, cost);
    }
}
