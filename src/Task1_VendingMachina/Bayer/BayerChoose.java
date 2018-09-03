package Task1_VendingMachina.Bayer;

import java.util.Scanner;

public class BayerChoose {

    public int moneyByBuyer(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){

            System.out.println("Внесите деньги!");
            scanner.next();

        }
        int actionBuyer = scanner.nextInt();


        return actionBuyer;
    }

    public int numberProductByBuyer(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){

            System.out.println("Вы указали не число!");
            scanner.next();

        }
        int actionBuyer = scanner.nextInt();


        return actionBuyer;
    }

}
