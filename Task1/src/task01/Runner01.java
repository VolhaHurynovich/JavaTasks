package task01;

//1. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//
//        Сумма двух первых цифр заданного четырехзначного числа
//        равна сумме двух его последних цифр.

public class Runner01 {
    public static void main(String[] args) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        String str = "4474";
        System.out.println(ClassForTask01.checkCondition(str));
    }
}
