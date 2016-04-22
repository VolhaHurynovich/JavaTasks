package task05;

//5. Даны три действительных числа.
//        Возвести в квадрат те из них, значения которых неотрицательны,
//        и в четвертую степень — отрицательные.

import java.io.IOException;

//  args[0] = a
//  args[1] = b
//  args[2] = c
public class Runner05 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, IOException {
        if (args.length != 3) {
            System.out.println("Enter three numbers. For example: 5 7 2");
            System.exit(0);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        ClassForTask05 myClass = new ClassForTask05();
        System.out.println("result: \na = " + myClass.executePow(a) + "\nb = " + myClass.executePow(b) + "\nc = " + myClass.executePow(c));
    }
}
