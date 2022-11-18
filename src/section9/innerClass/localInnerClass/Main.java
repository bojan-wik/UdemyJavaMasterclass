package section9.innerClass.localInnerClass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnSave = new Button("Save");

    public static void main(String[] args) {

        // LOCAL INNER CLASS
//        class ClickListener implements Button.OnClickListener {
//
//            public ClickListener() {
//                System.out.println("Listener connected to the button");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " button was clicked");
//            }
//        }
//
//        btnSave.setOnClickListener(new ClickListener());

        // ANONYMOUS INNER CLASS
        btnSave.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + "button was clicked");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnSave.onClick();
            }
        }
    }
}
