package com.timbuchalka;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        Path locPath = FileSystems.getDefault().getPath("locations.dat");
        // We're using that to get an output stream using a path instance because it's passing lock path. - Files.newOutputStream(locPath)
        // we created file output stream using the file output stream constructor.
        // So you're wrapping it up still in this buffered output stream so the io will be buffered.
        // Then you're wrapping that in an object output stream.
        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(locPath)))) {
            for (Location location: locations.values()) {
                locFile.writeObject(location);
            }
        }
//        //using Path instances
//        Path locPath = FileSystems.getDefault().getPath("locations_big.txt");
//        Path dirPath = FileSystems.getDefault().getPath("directions_big.txt");
//
//
//        //So when we use the files.new buffered writer here,
//        //a buffered writer is returned that performs io using an instance of the java.nio class called bytechannel
//        try (BufferedWriter locFile = Files.newBufferedWriter(locPath);
//             BufferedWriter dirFile = Files.newBufferedWriter(dirPath)) {
//            //writing location(-s)
//            for (Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                //writing exits of particular location
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        dirFile.write(location.getLocationID() + "," + direction + " ,"
//                                + location.getExits().get(direction) + "\n");
//                    }
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("IOException: " + e.getMessage());
//        }
    }

    static {
        Path locPath = FileSystems.getDefault().getPath("locations.dat");
        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(locPath)))) {
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    Location location = (Location) locFile.readObject();
                    locations.put(location.getLocationID(), location);
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }
        } catch (InvalidClassException e) {
            System.out.println("InvalidClassException " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }
//        // using same Path as in Location.main()
//        Path locPath = FileSystems.getDefault().getPath("locations_big.txt");
//        Path dirPath = FileSystems.getDefault().getPath("directions_big.txt");
//
//        try (Scanner scanner = new Scanner(Files.newBufferedReader(locPath))) {
//            scanner.useDelimiter(",");
//            while (scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                // null - it's got the code built in to test to see whether null
//                // has passed and it's going to create a new linked hashmap for
//                // our exits if it has otherwise it will just to save the value of or save the map
//                locations.put(loc, new Location(loc, description, null));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // add the code to the static initializer block to process the exits, the directions.
//        try (BufferedReader dirFile = Files.newBufferedReader(dirPath)) {
//            String input;
//
//            while ((input = dirFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

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
