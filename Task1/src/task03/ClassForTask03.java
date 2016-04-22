package task03;

import java.io.IOException;

//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
public class ClassForTask03 {
    private static final String NEGATIV_NUMBER_OR_ZERO = "Enter two numbers > 0";
    public String message = "";

    private boolean checkNumber(double a) {
        if ((a <= 0)) {
            message = NEGATIV_NUMBER_OR_ZERO;
            return false;
        }
        return true;
    }

    public double calculationSquare(double a, double b) throws IOException {
        if ((!checkNumber(a)) || (!checkNumber(b))) {
            throw new IOException(message);
        }
        return ((a * b) / 2);
    }

    public double calculationPerimeter(double a, double b) throws IOException {
        if ((!checkNumber(a)) || (!checkNumber(b))) {
            throw new IOException(message);
        }
        return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
