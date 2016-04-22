package task03;
//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

import java.io.IOException;

//  args[0] = a
//  args[1] = b
public class Runner03 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, IOException {
        if (args.length != 2) {
            System.out.println("Enter two numbers. For example: 5 7");
            System.exit(0);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        ClassForTask03 myClass = new ClassForTask03();
        System.out.println("Square of rectangular triangle is " + myClass.calculationSquare(a, b));
        System.out.println("Perimeter of rectangular triangle is " + myClass.calculationPerimeter(a, b));

    }
}
