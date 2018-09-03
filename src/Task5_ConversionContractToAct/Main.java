package Task5_ConversionContractToAct;

import Task5_ConversionContractToAct.Contract.MakeContract;
import Task5_ConversionContractToAct.ConversionContractToAct.Conversion;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String [] prod = new String[]{"Молоко","Капуста"};

        MakeContract contract1 = new MakeContract(132,LocalDate.of(2018, 2, 24),prod);

        System.out.println(contract1);

        Conversion.contractToAct(contract1);


    }



}
