package section9.interfaces;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.printf("%s powered up", getClass().getSimpleName()).println();
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.printf("Dialing the %d on %s", phoneNumber, getClass().getSimpleName()).println();
        } else {
            System.out.printf("%s is switched off", getClass().getSimpleName()).println();
        }
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
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
