package section12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Teatr muzyczny", 3, 3);
        System.out.println("theatre.seats");
        printList(theatre.getSeats());
//        theatre.getSeats();
//        theatre.reserveSeat("A02");
//        theatre.reserveSeat("B01");
//        theatre.reserveSeat("C03");
//        theatre.reserveSeat("A02");

        List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.getSeats());
        System.out.println("seats.copy");
        printList(seatsCopy);

//        theatre.reserveSeat("A02");
//        seatsCopy.get(1).reserve();

//        Collections.reverse(theatre.seats);
        Collections.shuffle(theatre.getSeats());
        System.out.println("theatre.seats - shuffle");
        printList(theatre.getSeats());
        System.out.println("seatsCopy");
        printList(seatsCopy);

        Theatre.Seat minSeat = Collections.min(theatre.getSeats());
        Theatre.Seat maxSeat = Collections.max(theatre.getSeats());
        System.out.printf("theatre.seats Min seat number is %s", minSeat.getSeatNumber()).println();
        System.out.printf("theatre.seats Max seat number is %s", maxSeat.getSeatNumber()).println();

        Collections.sort(theatre.getSeats());
        System.out.println("theatre.seats - sort");
        printList(theatre.getSeats());
    }

    public static void printList (List<Theatre.Seat> list) {
        System.out.println("---------------------------");
        for (Theatre.Seat element : list) {
            System.out.print(element.getSeatNumber() + " ");
        }
        System.out.println("\n---------------------------");
    }
}
