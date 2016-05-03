package task01;

//1. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//
//        Сумма двух первых цифр заданного четырехзначного числа
//        равна сумме двух его последних цифр.

public class ClassForTask01 {
    private static final int COUNT = 4;

    public static boolean checkNumber(String sequence) {
        if (!isNumber(sequence)) {
            throw new RuntimeException("It is not a number");
        }
        return true;
    }

    public static boolean checkLength(String sequence) {
        if (sequence.length() != COUNT) {
            throw new RuntimeException("Enter any number (4 figures)");
        }
        return true;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCondition(String sequence) {
        if (checkNumber(sequence) && checkLength(sequence)) {
            int digitSum1, digitSum2;
            digitSum1 = Integer.parseInt("" + sequence.charAt(0)) + Integer.parseInt("" + sequence.charAt(1));
            digitSum2 = Integer.parseInt("" + sequence.charAt(2)) + Integer.parseInt("" + sequence.charAt(3));
            if (digitSum1 != digitSum2) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
