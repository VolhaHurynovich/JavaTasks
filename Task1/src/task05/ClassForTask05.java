package task05;

//5. Даны три действительных числа.
//        Возвести в квадрат те из них, значения которых неотрицательны,
//        и в четвертую степень — отрицательные.
public class ClassForTask05 {
    public double executePow(double a) {
        if (a >= 0) {
            return Math.pow(a, 2);
        }
        return Math.pow(a, 4);
    }
}
