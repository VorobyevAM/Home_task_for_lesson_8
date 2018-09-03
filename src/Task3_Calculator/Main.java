package Task3_Calculator;

import Task3_Calculator.CalculatorBody.Calculator;
import Task3_Calculator.User.User;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        Calculator.setA(user.theNumberSpecifiedByTheUser());
        Calculator.setB(user.theNumberSpecifiedByTheUser());

        Calculator.addition();
        Calculator.subtraction();
        Calculator.multiplication();
        Calculator.division();
        Calculator.percentageOfTheNumber();

    }

}

