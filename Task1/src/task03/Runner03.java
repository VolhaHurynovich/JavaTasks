package task03;
//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

//  args[0] = a
//  args[1] = b
public class Runner03 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Enter two numbers. For example: 5 7");
                System.exit(0);
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            if ((a <= 0) || (b <= 0)) {
                System.out.println("Enter two numbers > 0");
                System.exit(0);
            }
            System.out.println("Square of rectangular triangle is " + executeSquare(a, b));
            System.out.println("Perimeter of rectangular triangle is " + executePerimeter(a, b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. Please enter two numbers (a b)");
        } catch (Error e) {
            System.out.println(e);
        }
    }

    private static double executeSquare(double a, double b) {
        return ((a * b) / 2);
    }

    private static double executePerimeter(double a, double b) {
        return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
