package task10;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

import NewException;

public class ClassForTask10 {
    public static boolean checkNByZero(int n) {
        if (n < 0) {
            throw new NewException("Enter n > 0");
        }
        return true;
    }

    public static boolean checkNByEven(int n) {
        if (n % 2 != 0) {
            throw new NewException("n is not even number");
        }
        return true;
    }

    public static int[][] createArray(int n) {
        if (checkNByZero(n) && checkNByEven(n)) {
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
        } else {
            throw new NewException("Some problem");
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
