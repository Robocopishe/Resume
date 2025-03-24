package Test_2;

import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {

        int example = 1;

        int[] array = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0,0};

        for (int i = 0 ; i <=10; i++ ){
                if (array[i] != example) {
                    array[i] = example;
                }else{
                    array [i] = 0;
                }
            System.out.println( array[i]);
        }

    }
}
