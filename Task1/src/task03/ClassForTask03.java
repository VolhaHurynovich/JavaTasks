package task03;

//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

import myException.NewException;

public class ClassForTask03 {
    public static boolean checkNumber(double a) {
        if ((a <= 0)) {
            throw new NewException("Enter two numbers > 0");
        }
        return true;
    }

    public static double calculationSquare(double a, double b) {
        if ((!checkNumber(a)) || (!checkNumber(b))) {
            throw new NewException("Some problem");
        }
        return ((a * b) / 2);
    }

    public static double calculationPerimeter(double a, double b) {
        if ((!checkNumber(a)) || (!checkNumber(b))) {
            throw new NewException("Some problem");
        }
        return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
