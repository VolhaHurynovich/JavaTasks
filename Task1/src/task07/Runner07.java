package task07;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//        с шагом h. Результат представить в виде таблицы, первый столбец которой
//        – значения  аргумента, второй - соот¬ветствующие значения функции

import java.io.IOException;

//  args[0] = a
//  args[1] = b
//  args[2] = h
public class Runner07 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, IOException {
        if (args.length != 3) {
            System.out.println("Enter three numbers. For example: 5 7 2");
            System.exit(0);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);
        ClassForTask07 myClass = new ClassForTask07();
        System.out.println("\t x \t\t\t F(x)");
        myClass.printArray(myClass.calculationFunction(a, b, h));
    }


}
