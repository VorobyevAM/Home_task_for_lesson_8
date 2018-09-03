package Task5_ConversionContractToAct.Contract;

import java.time.LocalDate;
import java.util.Arrays;

public class MakeContract {

    private int numberContract;
    private LocalDate dateContract;
    private String[] ListOfProductsContract;

    public MakeContract() {
    }

    public MakeContract(int number, LocalDate date, String[] listOfProducts) {
        this.numberContract = number;
        this.dateContract = date;
        this.ListOfProductsContract = listOfProducts;
    }

    @Override
    public String toString() {
        return "Договор {" +
                "number=" + numberContract +
                ", date=" + dateContract +
                ", ListOfProducts=" + Arrays.toString(ListOfProductsContract) +
                '}';
    }

    public int getNumberContract() {
        return numberContract;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public String[] getListOfProductsContract() {
        return ListOfProductsContract;
    }
}
