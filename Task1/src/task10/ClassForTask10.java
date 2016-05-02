package task10;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class ClassForTask10 {
    public static boolean checkNByZero(int n) throws NumberFormatException{
        if (n < 0) {
            throw new NumberFormatException("Enter n > 0");
        }
        return true;
    }

    public static boolean checkNByEven(int n) throws NumberFormatException{
        if (n % 2 != 0) {
            throw new NumberFormatException("n is not even number");
        }
        return true;
    }

    public static int[][] createArray(int n) throws NumberFormatException, ArithmeticException {
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
            throw new ArithmeticException("Some problem");
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
