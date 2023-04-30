# Практична робота "Поглиблене використання масивів"

## Завдання 4
>Знайти друге за величиною число у матриці розміром N x M

**Код файлу** ```Main.java```**:**

```java
package domain;

/**
 * Contains methods to work with matrix
 */
public class Main {

    /**
     * Generates matrix with random numbers from 0 to 9
     * @param n matrix rows
     * @param m matrix cols
     * @return generated matix
     */
    public static int[][] generateMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    /**
     * Finds the second-largest number in the N x M matrix.
     * @param arr the N x M matrix to search in
     * @return the second-largest number in the matrix
     */
    public static int findSecondLargest(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num != max) {
                    secondMax = num;
                }
            }
        }

        return secondMax;
    }

}
```

**Код файлу** ```MainTest.java```**:**
```java
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
```

***Результат:***  
![](https://github.com/ppc-ntu-khpi/35-advarrays-un-know-n/blob/master/images/result.png)