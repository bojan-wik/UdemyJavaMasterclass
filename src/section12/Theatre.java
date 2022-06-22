package section12;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private Collection<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row ++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum ++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            System.out.print(".");
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.printf("There is no seat %s", seatNumber).println();
            return false;
        } else {
            return requestedSeat.reserve();
        }
    }

    // for testing
    public void getSeats() {
        System.out.println("==============================");
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
        System.out.println("==============================");
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        String getSeatNumber() {
            return seatNumber;
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
