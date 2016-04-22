package task02;

import java.io.IOException;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//  args[0] = a
//  args[1] = b
//  args[2] = c
public class Runner02 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, IOException {
        if (args.length != 3) {
            System.out.println("Enter three numbers. For example: 5 7 2");
            System.exit(0);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        ClassForTask02 myClass = new ClassForTask02();
        System.out.println("result = " + myClass.calculation(a, b, c));

    }
}
