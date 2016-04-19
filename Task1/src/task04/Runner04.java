package task04;

//4. Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и
//        false — в противном случае

//  args[0] = x
//  args[1] = y
public class Runner04 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Enter two numbers x and y. For example: 1 2");
                System.exit(0);
            }
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            System.out.println(execute(x,y));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException. Please enter two numbers (x y)");
        } catch (Exception e) {
            System.out.println(e);
        } catch (Error e) {
            System.out.println(e);
        }
    }

    private static boolean execute(double x, double y) {
        if (((x>=-4)&&(x<=4)&&(y>=-3)&&(y<=0))||((x>=-2)&&(x<=2)&&(y>=0)&&(y<=4))) {
            return true;
        }
        return false;
    }
}
