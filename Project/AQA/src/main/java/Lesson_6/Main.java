package Lesson_6;


public class Main {

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "text", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            ArraySizeValidator.validateSize(validArray);
            int sum = ArrayConverter.convertAndSum(validArray);
            System.out.println("Sum of elements in valid array: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException: " + e.getMessage());
        }

        try {
            ArraySizeValidator.validateSize(invalidSizeArray);
            int sum = ArrayConverter.convertAndSum(invalidSizeArray);
            System.out.println("Sum of elements in invalid size array: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException: " + e.getMessage());
        }

        try {
            ArraySizeValidator.validateSize(invalidDataArray);
            int sum = ArrayConverter.convertAndSum(invalidDataArray);
            System.out.println("Sum of elements in invalid data array: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException: " + e.getMessage());
        }
    }
}
