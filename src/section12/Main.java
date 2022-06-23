package section12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Teatr muzyczny", 2, 3);

//        theatre.getSeats();
//        theatre.reserveSeat("A02");
//        theatre.reserveSeat("B01");
//        theatre.reserveSeat("C03");
//        theatre.reserveSeat("A02");

        printList(theatre.seats);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
    }

    public static void printList (List<Theatre.Seat> list) {
        System.out.println("=========================");
        for (Theatre.Seat element : list) {
            System.out.print(element.getSeatNumber() + " ");
        }
        System.out.println("\n=========================");
    }
}
