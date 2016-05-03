package task07;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//        с шагом h. Результат представить в виде таблицы, первый столбец которой
//        – значения  аргумента, второй - соот¬ветствующие значения функции

public class Runner07 {
    public static void main(String[] args){
        double a = 0;
        double b = 5;
        double h = 0.1;
        System.out.println("\t x \t\t\t F(x)");
        ClassForTask07.printArray(ClassForTask07.calculationFunction(a, b, h));
    }


}
