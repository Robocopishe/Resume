package Lesson_6;

public class ArraySizeValidator {
    public static void validateSize(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Array size must be 4x4.");
        }
    }
}
