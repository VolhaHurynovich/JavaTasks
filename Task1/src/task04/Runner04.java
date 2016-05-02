package task04;

//4. Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и
//        false — в противном случае

public class Runner04 {
    public static void main(String[] args) {
        int[] mas1 = {-4, 4, 0, -3};
        int[] mas2 = {-2, 2, 4, 0};
        double x = -1;
        double y = -3;
        System.out.println(ClassForTask04.isPointInTheArea(x, y, mas1) || ClassForTask04.isPointInTheArea(x, y, mas2));
    }

}
