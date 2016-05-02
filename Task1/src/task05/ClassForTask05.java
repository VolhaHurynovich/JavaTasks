package task05;

//5. Даны три действительных числа.
//        Возвести в квадрат те из них, значения которых неотрицательны,
//        и в четвертую степень — отрицательные.
public class ClassForTask05 {
    public static double[] calcArray(double[] mas) {
        double res[] = new double[mas.length];
        for (int i = 0; i < mas.length; i++) {
            res[i] = executePow(mas[i]);
        }
        return res;
    }

    public static double executePow(double a) {
        if (a >= 0) {
            return Math.pow(a, 2);
        }
        return Math.pow(a, 4);
    }
}
