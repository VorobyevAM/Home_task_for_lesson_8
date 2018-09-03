package Task5_ConversionContractToAct.ConversionContractToAct;

import Task5_ConversionContractToAct.Act.Act;
import Task5_ConversionContractToAct.Contract.MakeContract;

public class Conversion {

    public static Act contractToAct(MakeContract nextcontract){
        Act act = new Act();

//        Act act = new Act(nextcontract.getNumberContract(),nextcontract.getDateContract(),nextcontract.getListOfProductsContract());

        act.setNumberAct(nextcontract.getNumberContract());
        act.setDateAct(nextcontract.getDateContract());
        act.setListOfProductsAct(nextcontract.getListOfProductsContract());
        System.out.println(act);
      return act;
    }

}
