package task06;

//6. Написать программу нахождения суммы большего и меньшего из трех чисел.

//  args[0] = a
//  args[1] = b
//  args[2] = c
public class Runner06 {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Enter three numbers. For example: 5 7 2");
                System.exit(0);
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            System.out.println("result = " + execute(a, b, c));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. Please enter three numbers (a b c)");
        }
    }

    private static double execute(double a, double b, double c) {
        double min = a, max = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return (max + min);
    }

}
