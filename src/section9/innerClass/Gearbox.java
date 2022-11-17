package section9.innerClass;

import java.util.ArrayList;

// OUTER CLASS
public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0; // skrzynia biegów ustawiona na luz
    private boolean clutchIsIn = false;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        gears = new ArrayList<>();

        for (int i = 0; i < maxGears; i ++) {
            addGear(i, i * 5.3);
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    private void addGear(int gearNumber, double ratio) {
        if (gearNumber > 0 && gearNumber <= maxGears) {
            gears.add(new Gear(gearNumber, ratio));
        }
    }

   public void changeGear(int newGear) {
        if (newGear >= 0 && newGear <= gears.size() && clutchIsIn) {
            currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            currentGear = 0;
        }
   }

    public void operateClutch(boolean in) {
        clutchIsIn = in;
    }

   public double getWheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("The clutch is in and the car is not moving.");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
   }

    // INNER CLASS
    private class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        /**
         * @param revs = obroty silnika
         */
        public double driveSpeed(int revs) {
            return revs * ratio;
        }
    }
}
