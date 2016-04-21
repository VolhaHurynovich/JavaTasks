package task10;

import java.io.IOException;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Runner10 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = 8;
        ClassForTask10 myClass = new ClassForTask10();
        System.out.println("Result array:");
        myClass.printArray(myClass.createArray(n));
    }
}
