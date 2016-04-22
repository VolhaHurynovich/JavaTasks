package task01;

import java.io.IOException;

//1. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//
//        Сумма двух первых цифр заданного четырехзначного числа
//        равна сумме двух его последних цифр.
public class Runner01 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = "5762";
        ClassForTask01 myClass = new ClassForTask01();
        System.out.println(myClass.checkCondition(str));

    }
}
