package composition.exampleRoom;

public class Room {

    private HiFiAudio theHiFiAudio;
    private Window theWindow;
    private Lamp theLamp;

    public Room(HiFiAudio theHiFiAudio, Window theWindow, Lamp theLamp) {
        this.theHiFiAudio = theHiFiAudio;
        this.theWindow = theWindow;
        this.theLamp = theLamp;
    }
}
