package section7.composition.exercise1;

public class Main {

    public static void main(String[] args) {
        HiFiAudio myHiFiAudio = new HiFiAudio("Pioneer", 2,
                new Radio(24, "FM"));
        Window myWindow = new Window("Drutex", true, new Dimensions(100, 50, 5));
        Lamp myLamp = new Lamp("IKEA", "240V", 2);

        Room myRoom = new Room(myHiFiAudio, myWindow, myLamp);
        myRoom.spendSomeCoolTime();
    }
}
