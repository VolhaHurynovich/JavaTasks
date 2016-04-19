package task05;
//5. Даны три действительных числа.
//        Возвести в квадрат те из них, значения которых неотрицательны,
//        и в четвертую степень — отрицательные.

//  args[0] = a
//  args[1] = b
//  args[2] = c
public class Runner05 {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Enter three numbers. For example: 5 7 2");
                System.exit(0);
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            System.out.println("result: \na = " + execute(a) + "\nb = " + execute(b) + "\nc = " + execute(c));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. Please enter three numbers (a b c)");
        }
    }

    private static double execute(double a) {
        if (a >= 0) {
            return Math.pow(a, 2);
        }
        return Math.pow(a, 4);
    }

}
