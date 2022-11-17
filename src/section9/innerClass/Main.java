package section9.innerClass;

public class Main {

    public static void main(String[] args) {
        Gearbox skodaGearbox = new Gearbox(5);

        System.out.println("Current gear: " + skodaGearbox.getCurrentGear());
        skodaGearbox.changeGear(1);
        skodaGearbox.operateClutch(true);
        skodaGearbox.changeGear(1);
        System.out.println(skodaGearbox.getWheelSpeed(1000));
        skodaGearbox.operateClutch(false);
        System.out.println(skodaGearbox.getWheelSpeed(1000));
    }
}
