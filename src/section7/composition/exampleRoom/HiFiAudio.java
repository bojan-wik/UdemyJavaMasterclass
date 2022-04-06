package section7.composition.exampleRoom;

public class HiFiAudio {

    private String manufacturer;
    private int numberOfSpeakers;
    private Radio radio;

    public HiFiAudio(String manufacturer, int numberOfSpeakers, Radio radio) {
        this.manufacturer = manufacturer;
        this.numberOfSpeakers = numberOfSpeakers;
        this.radio = radio;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }
    public Radio getRadio() {
        return radio;
    }

    public void playMusic(String musicType) {
        System.out.printf("Playing %s music", musicType).println();
    }
}
