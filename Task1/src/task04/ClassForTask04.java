package task04;

//4. Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и
//        false — в противном случае
public class ClassForTask04 {
    private static final int X1_FOR_AREA1 = -4;
    private static final int X2_FOR_AREA1 = 4;
    private static final int Y1_FOR_AREA1 = 0;
    private static final int Y2_FOR_AREA1 = -3;

    private static final int X1_FOR_AREA2 = -2;
    private static final int X2_FOR_AREA2 = 2;
    private static final int Y1_FOR_AREA2 = 0;
    private static final int Y2_FOR_AREA2 = -4;

    public boolean isPointInTheArea(double x, double y) {
        if (((x >= X1_FOR_AREA1) && (x <= X2_FOR_AREA1) && (y >= Y2_FOR_AREA1) && (y <= Y1_FOR_AREA1)) || ((x >= X1_FOR_AREA2) && (x <= X2_FOR_AREA2) && (y >= Y1_FOR_AREA2) && (y <= Y2_FOR_AREA2))) {
            return true;
        }
        return false;
    }
}
