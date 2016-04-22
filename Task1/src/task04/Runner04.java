package task04;

//4. Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и
//        false — в противном случае

import java.io.IOException;

//  args[0] = x
//  args[1] = y
public class Runner04 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        if (args.length != 2) {
            System.out.println("Enter two numbers x and y. For example: 1 2");
            System.exit(0);
        }
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        ClassForTask04 myClass = new ClassForTask04();
        System.out.println(myClass.isPointInTheArea(x, y));
    }

}
