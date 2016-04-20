package task07;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//        с шагом h. Результат представить в виде таблицы, первый столбец которой
//        – значения  аргумента, второй - соот¬ветствующие значения функции

//  args[0] = a
//  args[1] = b
//  args[2] = h
public class Runner07 {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Enter three numbers. For example: 5 7 2");
                System.exit(0);
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double h = Double.parseDouble(args[2]);
            if (a > b) {
                System.out.println("Enter three numbers (a b h), where a < b. For example: 5 7 0.1");
                System.exit(0);
            }
            execute(a, b, h);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. Please enter three numbers (a b c)");
        }
    }

    private static void execute(double a, double b, double h) {
        double x = a;
        System.out.println("\t x \t\t\t F(x)");
        while (x <= b) {
            System.out.printf("%10f   %10f \n", x, calculation(x));
            x = x + h;
        }
    }

    private static double calculation(double x) {
        return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
    }

}
