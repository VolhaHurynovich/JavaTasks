package task10;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Runner10 {
    public static void main(String[] args) throws NumberFormatException, ArithmeticException{
        int n = 8;
        System.out.println("Result array:");
        ClassForTask10.printArray(ClassForTask10.createArray(n));
    }
}
