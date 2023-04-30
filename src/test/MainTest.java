import domain.Main;

import java.util.Arrays;

public class MainTest {
    /**
     * This is the main method that generates a matrix of size N x M, prints it to the console, and finds the second-largest number in the matrix.
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = Main.generateMatrix(5, 7);
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        int secondLargest = Main.findSecondLargest(matrix);
        System.out.println("Second largest number: " + secondLargest);
    }
}