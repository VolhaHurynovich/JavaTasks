package task09;

//9. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//        Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

import NewException;

public class ClassForTask09 {
    public static boolean checkKByZero(double[] array1, int k) {
        if (k < 0) {
            throw new NewException("Enter k > 0");
        }
        return true;
    }
    public static boolean checkByLength(double[] array1, int k) {
        if (k > array1.length) {
            throw new NewException("Enter k <= array1 length");
        }
        return true;
    }
    public static double[] joinArrays(double[] array1, double[] array2, int k) {
        if (checkKByZero(array1, k) && checkByLength(array1, k)) {
            double[] resultArray = new double[array1.length + array2.length];
            for (int i = 0; i < k; i++) {
                resultArray[i] = array1[i];
            }
            for (int i = k; i < (k + array2.length); i++) {
                resultArray[i] = array2[i - k];
            }
            for (int i = (k + array2.length); i < (array1.length + array2.length); i++) {
                resultArray[i] = array1[i - array2.length];
            }
            return resultArray;
        } else {
            throw new NewException("Some problem");
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
