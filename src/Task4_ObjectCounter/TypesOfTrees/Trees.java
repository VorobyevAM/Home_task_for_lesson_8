package Task4_ObjectCounter.TypesOfTrees;

public class Trees {

    private String nameOfTree;
    protected static int countTypeTree;

    public Trees(String nameOfTree) {
        countTypeTree++;
        this.nameOfTree = nameOfTree;

    }

    public static int getCountTypeTree() {
        System.out.println("Количество созданых типов деревьев равно " + countTypeTree);
        return countTypeTree;
    }
}
