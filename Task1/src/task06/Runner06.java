package task06;

//6. Написать программу нахождения суммы большего и меньшего из трех чисел.

import java.io.IOException;

//  args[0] = a
//  args[1] = b
//  args[2] = c
public class Runner06 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        if (args.length != 3) {
            System.out.println("Enter three numbers. For example: 5 7 2");
            System.exit(0);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        ClassForTask06 myClass = new ClassForTask06();
        System.out.println("result = " + myClass.sumMinMax(a, b, c));
    }


}
