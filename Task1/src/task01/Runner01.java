package task01;

//1. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае:
//
//        Сумма двух первых цифр заданного четырехзначного числа
//        равна сумме двух его последних цифр.
public class Runner01 {
    public static void main(String[] args) {
        try {
            if (args[0].length() != 4) {
                System.out.println("Enter any number (4 figures). For example: 3443");
                System.exit(0);
            }
            System.out.println(execute(args[0]));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. It is not a number. Enter any number (4 figures). For example: 3443");
        } catch (Exception e) {
            System.out.println(e);
        } catch (Error e) {
            System.out.println(e);
        }
    }

    private static boolean execute(String sequence) {
        int digitSum1, digitSum2;
        Integer.parseInt(sequence);
        digitSum1 = Integer.parseInt("" + sequence.charAt(0)) + Integer.parseInt("" + sequence.charAt(1));
        digitSum2 = Integer.parseInt("" + sequence.charAt(2)) + Integer.parseInt("" + sequence.charAt(3));
        if (digitSum1 != digitSum2) {
            return false;
        }
        return true;
    }
}