package task04;

//4. Для данных областей составить линейную программу, которая печатает true,
//        если точка с координатами (х, у) принадлежит закрашенной области, и
//        false — в противном случае


public class Runner04 {
    public static void main(String[] args)  {
        double x = 0;
        double y = 1;
        System.out.println(ClassForTask04.isPointInTheArea(x, y));
    }

}
