package section12;

import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row ++) {
            double price = 12.00;
            if (row <= 'B') {
                price = 14.00;
            }
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum ++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber) {
        // BINARY SEARCH - bardziej wydajne w tym przypadku (posortowana lista)
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.printf("There is no seat %s", seatNumber).println();
            return false;
        }
        // LINEAR SEARCH - mniej wydajne w tym przypadku
//        Seat requestedSeat = null;
//        for (Seat seat : seats) {
//            System.out.print(".");
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.printf("There is no seat %s", seatNumber).println();
//            return false;
//        } else {
//            return requestedSeat.reserve();
//        }
    }

    public class Seat implements Comparable<Seat> {

        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.printf("Seat %s reserved", seatNumber).println();
                return true;
            } else {
                System.out.printf("Seat %s is already reserved", seatNumber).println();
                return false;
            }
        }

        public boolean cancelReservation() {
            if (this.reserved) {
                this.reserved = false;
                System.out.printf("Reservation of seat %s cancelled", seatNumber).println();
                return true;
            } else {
                System.out.printf("Seat %s wasn't reseved in the first place", seatNumber).println();
                return false;
            }
        }
    }
}
