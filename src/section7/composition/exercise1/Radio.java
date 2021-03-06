package section7.composition.exercise1;

public class Radio {

    private int numberOfRadioStations;
    private String frequency;

    public Radio(int numberOfRadioStations, String frequency) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.frequency = frequency;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }
    public String getFrequency() {
        return frequency;
    }
}
