package Task3_Calculator.User;

import java.util.Scanner;

public class User {

    public double theNumberSpecifiedByTheUser(){
        System.out.println("Укажите число: ");
        double theNumberSpecifiedByTheUser;

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()){
            theNumberSpecifiedByTheUser=scanner.nextDouble();
        }else {
            System.out.println("Вы указали не число! Результат действий даст нулевой результат.");
            theNumberSpecifiedByTheUser=0;

        }

       return  theNumberSpecifiedByTheUser;
    }

}
