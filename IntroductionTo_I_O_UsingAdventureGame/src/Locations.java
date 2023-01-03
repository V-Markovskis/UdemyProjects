import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer,Location> locations = new LinkedHashMap<Integer,Location>();

    public static void main(String[] args) throws IOException {
        try (BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
             BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))) {
            for(Location location: locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for(String direction: location.getExits().keySet()) {
                    if(!direction.equalsIgnoreCase("Q")) {
                        dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                    }
                }
            }
        }
    }

    static {
        try (BufferedReader locFile = new BufferedReader(new FileReader("locations_big.txt"))) {
            String input;
            while ((input = locFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String description = data[1];
                if(data.length > 2) {
                    for (int i = 2; i < data.length; i++) {
                        description = description + "," + data[i];
                    }
                }
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                //below (if statement) created by myself to put exits in tempExit Map
//                if(loc == 1) {
//                    tempExit.put("W",2);
//                    tempExit.put("E", 3);
//                    tempExit.put("S", 4);
//                    tempExit.put("N", 5);
//                } else if(loc == 2) {
//                    tempExit.put("N", 5);
//                } else if(loc == 3) {
//                    tempExit.put("W", 1);
//                } else if(loc == 4) {
//                    tempExit.put("N", 1);
//                    tempExit.put("W", 2);
//                } else if (loc == 5) {
//                    tempExit.put("S", 1);
//                    tempExit.put("W", 2);
//                }
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Now read the exits
        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while ((input = dirFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);

                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Map<String, Integer> tempExit = new HashMap<>();
//
//        locations.put(0, new Location(0,"You are sitting in front of a computer learning Java",null));
//
//        tempExit = new HashMap<>();
//        tempExit.put("W",2);
//        tempExit.put("E", 3);
//        tempExit.put("S", 4);
//        tempExit.put("N", 5);
//        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building",tempExit));
//
//        locations.get(1).addExit("Q", 0);
//
//        tempExit = new HashMap<>();
//        tempExit.put("N", 5);
//        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//        locations.get(2).addExit("Q", 0);
//
//        tempExit = new HashMap<>();
//        tempExit.put("W", 1);
//        locations.put(3, new Location(3,"You are inside a building, a well house for a small spring",tempExit));
//
//        locations.get(3).addExit("Q", 0);
//
//
//        tempExit = new HashMap<>();
//        tempExit.put("N", 1);
//        tempExit.put("W", 2);
//        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
//
//        locations.get(4).addExit("Q", 0);
//
//        tempExit = new HashMap<>();
//        tempExit.put("S", 1);
//        tempExit.put("W", 2);
//        locations.put(5, new Location(5, "You are in the forest",tempExit));
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key,value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> map) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
