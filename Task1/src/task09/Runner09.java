package task09;

//9. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//        Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

public class Runner09 {
    public static void main(String[] args) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException  {
        double[] array1 = {1, 2, 3, 4, 5, 6};
        double[] array2 = {10, 20, 30, 40};
        int k = 5;
        System.out.println("Result array:");
        ClassForTask09.printArray(ClassForTask09.joinArrays(array1, array2, k));
    }
}