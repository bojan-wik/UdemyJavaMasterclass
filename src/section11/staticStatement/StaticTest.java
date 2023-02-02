package section11.staticStatement;

public class StaticTest {

    private static int numberOfInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numberOfInstances ++;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getName() {
        return name;
    }
}
