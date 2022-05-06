package section9.interfaces;

public class DeskPhone implements Telephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.printf("No action taken, no power button on %s", getClass().getSimpleName()).println();
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.printf("Dialing the %d on %s", phoneNumber, getClass().getSimpleName()).println();
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.printf("Answering the %s", getClass().getSimpleName()).println();
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
