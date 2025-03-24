package Test_2;

import java.util.Scanner;


public class PositiveCheker  {

    public static void isSumBetween10And20(int num) {

        if (num >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter the first integer: ");
        num = scan.nextInt();
        isSumBetween10And20(num);

    }
}