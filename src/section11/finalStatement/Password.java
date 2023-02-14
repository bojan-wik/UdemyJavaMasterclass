package section11.finalStatement;

public class Password {

    private static final int KEY = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ KEY;
    }

    public void storePassword() {
        System.out.println("Saving password as: " + encryptedPassword);
    }

    public boolean logIn(int password) {
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Password is correct. Login successful");
            return true;
        } else {
            System.out.println("Password is incorrect. Login unsuccessful");
            return false;
        }
    }
}
