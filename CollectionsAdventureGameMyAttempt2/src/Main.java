/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.command();
    }

    public void command() {
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("NORTH", "N");
        vocabulary.put("QUIT", "Q");

        Scanner scanner = new Scanner(System.in);
        int loc = 1;
        while (true) {
            if(loc == 0) {
                System.out.println(locations.get(loc).getDescription());
                break;
            }


            Map<String, Integer> destinationPoint = locations.get(loc).getExits();
            System.out.println("Available exits: ");
            for(String exit: destinationPoint.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String move = scanner.nextLine().toUpperCase();
            if(move.length() > 1) {
                String[] locationToSplit = move.split(" ");
                for(String word: locationToSplit) {
                    if(vocabulary.containsKey(word)){
                        move = vocabulary.get(word);
                        break;
                    }
                }
            }
            if(destinationPoint.containsKey(move)) {
                loc = destinationPoint.get(move);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}