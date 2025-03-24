package Test_2;

public class Diagonal {
    public static void main(String[] args) {
        int size = 5;
        int[][] squareArray = new int[size][size];


        for (int i = 0; i < size; i++) {
            squareArray[i][i] = 1;
        }


        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(squareArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}
