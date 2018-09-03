package Task1_VendingMachina.VendingMachina;

import Task1_VendingMachina.Bayer.BayerChoose;

import java.util.Arrays;

public class VendingMachina {

    private int money;
    private String[] products;
    private int[] costProducts;
    int numberProduct;

    public VendingMachina(String[] products, int[] costProducts) {
        this.products = products;
        this.costProducts = costProducts;
    }


/*    public int[] getCostProducts() {
        return costProducts;
    }*/

    public void setMoney(int money) {
        System.out.println("Стоимость напитка " + this.products[numberProduct] + " составляет: " + this.costProducts[numberProduct]);

            while (money<costProducts[numberProduct]){
                System.out.println("Вы внесли не достаточную сумму");
                BayerChoose bayerChoose = new BayerChoose();
                money+=bayerChoose.moneyByBuyer();

            }
            money=money-costProducts[numberProduct];
            System.out.println("Возьмите ваш напиток " + products[numberProduct] + " и заберите сдачу: " + money);

        this.money = money;
    }

    public void setNumberProduct(int numberProduct) {
        if (numberProduct>products.length){
            System.out.println("Такого напитка нет! Укажите существующий");
            }else{
                System.out.println("Вы выбрали: " + this.products[numberProduct]);
            this.numberProduct = numberProduct;
            }
        System.out.println("Номер напитка: " + this.numberProduct);
    }

    public String vendingMachinaShowYuoProduct(){

        String showProduct = Arrays.toString(products);

        return showProduct;

    }

}
