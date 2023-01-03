package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Monster monster = new Monster("Less", 12,55);
//        System.out.println(monster.toString());
//        saveObject(monster);
//
//        monster.setHitPoints(10);
//        System.out.println(monster);
//        saveObject(monster);
//        loadObject(monster);
//        System.out.println(monster);

        Player player = new Player("Platy",22, 49);
        System.out.println(player);
        saveObject(player);
        System.out.println("==================");

        player.setHitPoints(3);
        player.setName("Geo");
        saveObject(player);
        System.out.println(player);
        loadObject(player);
        System.out.println(player);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

