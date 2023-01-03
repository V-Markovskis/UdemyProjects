package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        //local class defined within the method
        class ClickListener implements Button.IOnClickListener {
            public ClickListener() {
                System.out.println("New instance of ClickListener created");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListenerVariable(new ClickListener());
//        btnPrint.setOnClickListenerVariable(new Button.IOnClickListener() {
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        });
//        listen();
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
                    btnPrint.onClick();
            }
        }
    }
}
