package task03;

//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.


public class Runner03 {
    public static void main(String[] args) throws Exception {
        double a = 1;
        double b = 1;
        System.out.println("Square of rectangular triangle is " + ClassForTask03.calculationSquare(a, b));
        System.out.println("Perimeter of rectangular triangle is " + ClassForTask03.calculationPerimeter(a, b));

    }
}
