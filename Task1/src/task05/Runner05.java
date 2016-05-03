package task05;

//5. Даны три действительных числа.
//        Возвести в квадрат те из них, значения которых неотрицательны,
//        и в четвертую степень — отрицательные.

public class Runner05 {
    public static void main(String[] args) {
        double[] mas = {8, 0, -7.6};
        for (double x : ClassForTask05.calcArray(mas)) {
            System.out.println(x);
        }
    }
}
