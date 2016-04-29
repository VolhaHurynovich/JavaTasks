package task03;

//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
public class ClassForTask03 {

    public static boolean checkNumber(double a) throws Exception {
        if ((a <= 0)) {
            throw new Exception("Enter two numbers > 0");
        }
        return true;
    }

    public static double calculationSquare(double a, double b) throws Exception {
        if ((!checkNumber(a)) || (!checkNumber(b))) {
            return 0;
        }
        return ((a * b) / 2);
    }

    public static double calculationPerimeter(double a, double b) throws Exception {
        if ((!checkNumber(a)) || (!checkNumber(b))) {
            return 0;
        }
        return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
