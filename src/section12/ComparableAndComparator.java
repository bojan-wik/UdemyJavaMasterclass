package section12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Teatr Wielki", 5, 5);
        printList(theatre.getSeats());

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


    }

    public static void printList (List<Theatre.Seat> list) {
        System.out.println("---------------------------");
        for (Theatre.Seat seat : list) {
            System.out.print(seat.getSeatNumber() + " ");
        }
        System.out.println("\n---------------------------");
    }
}
