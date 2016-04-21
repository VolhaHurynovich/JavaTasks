package task08;

import java.io.IOException;

//8. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Runner08 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] array = {1, 3, 5, 7, 777, 5432, 4445, 6667, 675};
        int k = 5;
        ClassForTask08 myClass = new ClassForTask08();
        System.out.println("Sum of multiple numbers is " + myClass.sumOfMultipleNumbers(array, k));
    }
}
