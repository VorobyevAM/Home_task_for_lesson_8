package Task5_ConversionContractToAct.Act;

import java.time.LocalDate;
import java.util.Arrays;

public class Act {

    private int numberAct;
    private LocalDate dateAct;
    private String [] listOfProductsAct;

    public Act() {
    }

/*    public Act(int numberAct, LocalDate dateAct, String[] listOfProductsAct) {
        this.numberAct = numberAct;
        this.dateAct = dateAct;
        this.listOfProductsAct = listOfProductsAct;
    }*/

    @Override
    public String toString() {
        return "Акт {" +
                "numberAct=" + numberAct +
                ", dateAct=" + dateAct +
                ", listOfProductsAct=" + Arrays.toString(listOfProductsAct) +
                '}';
    }

    public void setNumberAct(int numberAct) {
        this.numberAct = numberAct;
    }

    public void setDateAct(LocalDate dateAct) {
        this.dateAct = dateAct;
    }

    public void setListOfProductsAct(String[] listOfProductsAct) {
        this.listOfProductsAct = listOfProductsAct;
    }
}
