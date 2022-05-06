package section9.interfaces;

public class Main {

    public static void main(String[] args) {
        DeskPhone deskPhone = new DeskPhone(123456);
//        Telephone deskPhone = new DeskPhone(123456);
        deskPhone.powerOn();
        deskPhone.callPhone(123456);
        deskPhone.answer();
    }
}
