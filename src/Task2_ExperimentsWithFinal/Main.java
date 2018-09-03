package Task2_ExperimentsWithFinal;

import Task2_ExperimentsWithFinal.Final.Primer_final;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пример с использованием final для примитивного типа:");
        Primer_final.areaOfACircleWithARadius(Primer_final.radius());

        System.out.println();

        System.out.println("Пример с использованием final для ссылочного типа:");
        Primer_final primer_final =new Primer_final();
        System.out.println(primer_final);
        System.out.println("Так как это ссылочный тип константой является ссылка на объект, а не его содержание.");
        primer_final.pereprisvaivanieVStrola();
        System.out.println(primer_final);

    }

}
