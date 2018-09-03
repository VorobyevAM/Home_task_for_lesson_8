package Task2_ExperimentsWithFinal.Final;

import java.util.Arrays;
import java.util.Scanner;

public class Primer_final {

    private final static double PI = 3.14;
    private final String[] Stroka = new String[]{"1","2","3","4"};

    @Override
    public String toString() {
        return "Final{" +
                "stroka=" + Arrays.toString(Stroka) +
                '}';
    }

    public static double areaOfACircleWithARadius(double radius){
        double area = Math.pow(radius, 2) * PI;
        System.out.println("Площадь круга равна: " + area);
        return area;
    }

    public static double radius(){
        System.out.println("Для вычисления площади круга укажите его радиус: ");
        Scanner scanner = new Scanner(System.in);
        double radius=Double.parseDouble(scanner.nextLine());
        return radius;
    }

    public void pereprisvaivanieVStrola(){
        Stroka[2]="lalalal";
    }

}