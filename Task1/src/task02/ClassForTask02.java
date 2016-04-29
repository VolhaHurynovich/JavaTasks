package task02;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class ClassForTask02 {


    public static boolean checkDivisionByZero(double a, double b, double c) {
        if ((a == 0) || (b == 0)) {
            throw new ArithmeticException("Division by zero");
        }
        return true;
    }
    public static boolean checkSqrt(double a, double b, double c) {
        if ((Math.pow(b, 2) - (4 * a * c)) < 0) {
            throw new ArithmeticException("Sqrt from negative number");
        }
        return true;
    }

    public static double calculation(double a, double b, double c) throws ArithmeticException {
        if (checkDivisionByZero(a, b, c) && checkSqrt(a, b, c)) {
        return ((b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
        return 0;
    }

}

