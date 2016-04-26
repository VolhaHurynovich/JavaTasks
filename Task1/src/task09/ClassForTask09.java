package task09;

import java.io.IOException;

//9. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//        Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.
public class ClassForTask09 {
    public static final String CONST_K_LESS_0 = "Enter k > 0";
    public static final String CONST_K_BIGGER_ARRAY_LENGTH = "Enter k <= array1 length";
    public String message = "";

    public boolean chekK(double[] array1, int k) {
        if (k < 0) {
            message = CONST_K_LESS_0;
            return false;
        }
        if (k > array1.length) {
            message = CONST_K_BIGGER_ARRAY_LENGTH;
            return false;
        }
        return true;
    }

    public double[] joinArrays(double[] array1, double[] array2, int k) throws IOException {
        if (!chekK(array1, k)) {
            throw new IOException(message);
        }
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
    }

    public void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
