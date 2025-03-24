package Test_2;

import java.util.Scanner;

public class SumChecker {

    public static void isSumBetween10And20(int num1, int num2) {
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter the first integer: ");
        num1 = scan.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = scan.nextInt();
        isSumBetween10And20(num1,num2);

    }
}