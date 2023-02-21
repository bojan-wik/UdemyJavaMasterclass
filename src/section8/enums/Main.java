package section8.enums;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;

        System.out.println(weekDay);
        System.out.printf("Name is %s, Ordinal value = %d%n",
                weekDay.name(), weekDay.ordinal());

        System.out.println("Random day is: " + generateRandomDayOfTheWeek());

        switchDayOfWeek(DayOfTheWeek.SUN);
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInt = weekDay.ordinal() + 1;
        switch (weekDay) {
            case MON:
                System.out.println("Full name is Monday. Day number " + weekDayInt);
                break;
            case SUN:
                System.out.println("Full name is Sunday. Day number " + weekDayInt);
                break;
        }
    }

    public static DayOfTheWeek generateRandomDayOfTheWeek() {
        DayOfTheWeek[] values = DayOfTheWeek.values();
        int randomIndex = new Random().nextInt(values.length);

        return values[randomIndex];
    }
}
