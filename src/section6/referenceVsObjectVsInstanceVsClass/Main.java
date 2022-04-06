package section6.referenceVsObjectVsInstanceVsClass;

public class Main {

    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(anotherHouse.getColor());
    }
}
