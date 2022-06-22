package section12;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Teatr muzyczny", 2, 3);
        theatre.getSeats();
        theatre.reserveSeat("A02");
        theatre.reserveSeat("B01");
        theatre.reserveSeat("C03");
        theatre.reserveSeat("A02");
    }
}
