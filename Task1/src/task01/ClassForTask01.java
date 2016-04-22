package task01;

//1. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//
//        Сумма двух первых цифр заданного четырехзначного числа
//        равна сумме двух его последних цифр.

import java.io.IOException;

public class ClassForTask01 {
    private static final String NOT_NUMBER = "It is not a number. Enter any number (4 figures). For example: 3443";
    private static final String NOT_4_FIGURES = "Enter any number (4 figures). For example: 3443";
    public String message = "";

    private boolean checkNumber(String sequence) {
        if (!isNumber(sequence)) {
            message = NOT_NUMBER;
            return false;
        }
        if (sequence.length() != 4) {
            message = NOT_4_FIGURES;
            return false;
        }
        return true;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkCondition(String sequence) throws IOException {
        if (!checkNumber(sequence)) {
            throw new IOException(message);
        }
        int digitSum1, digitSum2;
        digitSum1 = Integer.parseInt("" + sequence.charAt(0)) + Integer.parseInt("" + sequence.charAt(1));
        digitSum2 = Integer.parseInt("" + sequence.charAt(2)) + Integer.parseInt("" + sequence.charAt(3));
        if (digitSum1 != digitSum2) {
            return false;
        }
        return true;
    }
}
