package Task3_Calculator.CalculatorBody;

public class Calculator {

    private static double a;
    private static double b;

    public static void setA(double a) {
        Calculator.a = a;
    }

    public static void setB(double b) {
        Calculator.b = b;
    }

    public static double addition  (){
        double addition=a+b;
        System.out.println("Сумма чисел " + a + " и " + b + " равна: " + addition);
        return addition;
    }

    public static double subtraction (){
        double subtraction=a-b;
        System.out.println("Разница чисел " + a + " и " + b + " равна: " + subtraction);
        return subtraction;
    }

    public static double multiplication (){
        double multiplication=a*b;
        System.out.println("Умножение числа " + a + " на число " + b + " равно: " + multiplication);
        return multiplication;
    }

    public static double division (){
        double division=a/b;
        System.out.println("Деление числа " + a + " на число " + b + " равно: " + division);
        return division;
    }

    public static double percentageOfTheNumber (){
        double percentageOfTheNumber=(a*b)/100;
        System.out.println("Число " + percentageOfTheNumber + " это " + b + " процетнов от числа " + a);
        return percentageOfTheNumber;
    }

}
