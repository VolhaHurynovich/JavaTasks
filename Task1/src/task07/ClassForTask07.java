package task07;

import java.io.IOException;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//        с шагом h. Результат представить в виде таблицы, первый столбец которой
//        – значения  аргумента, второй - соот¬ветствующие значения функции
public class ClassForTask07 {
    public static final String B_LESS_A = "Enter three numbers (a b h), where a < b. For example: 5 7 0.1";
    public static final String H_LESS_ZERO = "Enter h > 0";
    public String message = "";

    public boolean checkNumbers(double a, double b, double h) {
        if (a > b) {
            message = B_LESS_A;
            return false;
        }
        if (h <= 0) {
            message = H_LESS_ZERO;
            return false;
        }
        return true;
    }

    public double[][] calculationFunction(double a, double b, double h) throws IOException {
        if (!checkNumbers(a, b, h)) {
            throw new IOException(message);
        }
        double[][] res = new double[(int) ((b - a) / h) + 1][2];
        double x = a;
        int i = 0;
        while (x <= b) {
            res[i][0] = x;
            res[i][1] = calculation(x);
            x = x + h;
            i++;
        }
        return res;
    }

    public static double calculation(double x) {
        return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
    }

    public void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%10f  ", array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
