package task06;

//6. Написать программу нахождения суммы большего и меньшего из трех чисел.
public class ClassForTask06 {
    public double findMin(double a, double b) {
        if (b < a) {
            return b;
        }
        return a;
    }

    public double findMax(double a, double b) {
        if (b < a) {
            return a;
        }
        return b;
    }

    public double sumMinMax(double a, double b, double c) {
        return (findMax(findMax(a, b), c) + findMin(findMin(a, b), c));
    }
}

