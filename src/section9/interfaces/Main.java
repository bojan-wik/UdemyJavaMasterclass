package section9.interfaces;

public class Main {

    public static void main(String[] args) {
//        DeskPhone deskPhone = new DeskPhone(123456);
        ITelephone wiktorsPhone;
        wiktorsPhone = new DeskPhone(123456);
        wiktorsPhone.powerOn();
        wiktorsPhone.callPhone(123456);
        wiktorsPhone.answer();

//        MobilePhone mobilePhone = new MobilePhone(502182);
        wiktorsPhone = new MobilePhone(502185);
        wiktorsPhone.powerOn();
        wiktorsPhone.callPhone(502182);
        wiktorsPhone.answer();
    }
}
