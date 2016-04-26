package task10;

import java.io.IOException;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class ClassForTask10 {
    public static final String NOT_EVEN_NUMBER = "n is not even number";
    public static final String CONST_K_LESS_0 = "Enter n > 0";
    public String message = "";

    public boolean checkN(int n) {
        if (n < 0) {
            message = CONST_K_LESS_0;
            return false;
        }
        if (n % 2 != 0) {
            message = NOT_EVEN_NUMBER;
            return false;
        }
        return true;
    }

    public int[][] createArray(int n) throws IOException {
        if (!checkN(n)) {
            throw new IOException(message);
        }
        int[][] resultArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    resultArray[i][j] = j + 1;
                } else {
                    resultArray[i][j] = n - j;
                }
            }
        }
        return resultArray;
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
