package task02;

import java.io.IOException;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class ClassForTask02 {
    public static final String DIVISION_BY_ZERO = "Division by zero";
    public static final String SQRT_FROM_NEGATIV_NUMBER = "Sqrt from negative number";
    public String message = "";

    public boolean checkNumbers(double a, double b, double c) {
        if ((a == 0) || (b == 0)) {
            message = DIVISION_BY_ZERO;
            return false;
        }
        if ((Math.pow(b, 2) - (4 * a * c)) < 0) {
            message = SQRT_FROM_NEGATIV_NUMBER;
            return false;
        }
        return true;
    }

    public double calculation(double a, double b, double c) throws IOException {
        if (!checkNumbers(a, b, c)) {
            throw new IOException(message);
        }
        return ((b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}

