package task07;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//        с шагом h. Результат представить в виде таблицы, первый столбец которой
//        – значения  аргумента, второй - соот¬ветствующие значения функции
public class ClassForTask07 {

    public static boolean checkAB(double a, double b) throws NumberFormatException {
        if (a > b) {
            throw new NumberFormatException("Enter three numbers (a b h), where a < b. For example: 5 7 0.1");
        }
        return true;
    }
    public static boolean checkH(double h) throws NumberFormatException {
        if (h <= 0) {
            throw new NumberFormatException("Enter h > 0");
        }
        return true;
    }
    public static double[][] calculationFunction(double a, double b, double h) throws NumberFormatException, ArithmeticException {
        if (checkAB(a, b) && checkH(h)) {
            double[][] res = new double[(int) ((b - a) / h) + 1][2];
            double x = a;
            int i = 0;
            while (x <= b) {
                res[i][0] = x;
                res[i][1] = calculationFx(x);
                x = x + h;
                i++;
            }
            return res;
        } else {
            throw new ArithmeticException("Some problem");
        }
    }

    public static double calculationFx(double x) {
        return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
    }

    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%10f  ", array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
