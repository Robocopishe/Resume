package Test_2;

import java.util.Scanner;

public class ReturnArray {
    public static int[] initializeArray(int len, int initialValue) {
        int[] newArray = new int[len];

        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length ;
        int value;
        System.out.println("Input Length");
        length = scan.nextInt();
        System.out.println("Input Value");
        value = scan.nextInt();

        int[] myArray = initializeArray(length, value);

        System.out.println(java.util.Arrays.toString(myArray));

        int[] myArray2 = new int[length];
        java.util.Arrays.fill(myArray2,value);
        System.out.println(java.util.Arrays.toString(myArray2));
    }
}
