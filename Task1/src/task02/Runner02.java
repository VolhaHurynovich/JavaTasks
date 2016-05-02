package task02;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Runner02 {
    public static void main(String[] args) throws ArithmeticException{
        double a = 2;
        double b = 10.99;
        double c = 2.9;
        System.out.println("result = " + ClassForTask02.calculation(a, b, c));
    }
}
