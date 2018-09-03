package Task1_VendingMachina;

import Task1_VendingMachina.Bayer.BayerChoose;
import Task1_VendingMachina.VendingMachina.VendingMachina;

public class Main {

    public static void main(String[] args) {

        String[] coldDrink = new String[]{"Кока-Кола","Фанта","Спрайт"};
        int[] coldDrinkCost = new int[]{80,75,70};

        VendingMachina vendingMachina = new VendingMachina(coldDrink,coldDrinkCost);

        BayerChoose bayerChoose = new BayerChoose();

        System.out.println("Выберите напиток из: (Нумерация начинается с нуля)" + vendingMachina.vendingMachinaShowYuoProduct());
        vendingMachina.setNumberProduct(bayerChoose.numberProductByBuyer());
        System.out.println("Внесите деньги: ");
        vendingMachina.setMoney(bayerChoose.moneyByBuyer());

        System.out.println();
        System.out.println();
        System.out.println();

        String[] hotDrink = new String[]{"Кофе","Какао","Чай"};
        int[] hotDrinkCost = new int[]{150,80,50};

        VendingMachina vendingMachinaHotDrink = new VendingMachina(hotDrink,hotDrinkCost);

        BayerChoose bayerChooseHotDrink = new BayerChoose();

        System.out.println("Выберите напиток из: (Нумерация начинается с нуля)" + vendingMachinaHotDrink.vendingMachinaShowYuoProduct());
        vendingMachinaHotDrink.setNumberProduct(bayerChoose.numberProductByBuyer());
        System.out.println("Внесите деньги: ");
        vendingMachinaHotDrink.setMoney(bayerChoose.moneyByBuyer());



    }

}
