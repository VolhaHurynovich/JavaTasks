package task02;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//  args[0] = a
//  args[1] = b
//  args[2] = c
public class Runner02 {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Enter three numbers. For example: 5 7 2");
                System.exit(0);
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            if ((a == 0) || (b == 0)) {
                System.out.println("Division by zero");
                System.exit(0);
            }
            double forHelp = execute(a, b, c);
            if (Double.isNaN(forHelp)) {
                System.out.println("Sqrt from negative number");
                System.exit(0);
            }
            System.out.println("result = " + forHelp);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. Please enter three numbers (a b c)");
        }
    }

    private static double execute(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }

}
