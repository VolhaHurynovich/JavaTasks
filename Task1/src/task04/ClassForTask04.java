package task04;

//4. Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и
//        false — в противном случае

public class ClassForTask04 {
    public static boolean isPointInTheArea(double x, double y, int[] mas) {
        if (((x >= mas[0]) && (x <= mas[1]) && (y >= mas[3]) && (y <= mas[2]))) {
            return true;
        }
        return false;
    }
}
