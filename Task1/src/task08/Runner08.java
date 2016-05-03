package task08;

//8. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Runner08 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 777, 5432, 4445, 6667, 675};
        int k = 5;
        System.out.println("Sum of multiple numbers is " + ClassForTask08.sumOfMultipleNumbers(array, k));
    }
}
