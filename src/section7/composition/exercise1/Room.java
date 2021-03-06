package section7.composition.exercise1;

public class Room {

    private HiFiAudio theHiFiAudio;
    private Window theWindow;
    private Lamp theLamp;

    public Room(HiFiAudio theHiFiAudio, Window theWindow, Lamp theLamp) {
        this.theHiFiAudio = theHiFiAudio;
        this.theWindow = theWindow;
        this.theLamp = theLamp;
    }

    public void spendSomeCoolTime() {
        theWindow.openWindow();
        theLamp.turnLampOn();
        theHiFiAudio.playMusic("rock'n'roll");
    }
}
