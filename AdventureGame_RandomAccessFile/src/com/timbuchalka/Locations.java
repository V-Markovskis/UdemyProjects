package com.timbuchalka;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();

    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {
//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
//            for (Location location : locations.values()) {
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
//                locFile.writeInt(location.getExits().size() - 1);
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
//            }
//        }
        // The whole contents were consisted of  A part, B part, C part, data of locations.
        // A part 0 ~ 3 byte (number of locations)
        // B part 4 ~ 7 byte (start offset of the locations section)
        // C part 8 ~ 1699 bytes (contain the index)
        // data of locations 1700 ~ end (location records (the data))

        try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            // A part - total number of locations which is 141
            rao.writeInt(locations.size());
            // B part - start place of location's data, which is after A + B + C part
            int indexSize = locations.size() * 3 * Integer.BYTES; // length of C part
            int locationStart  = (int) (indexSize + rao.getFilePointer() + Integer.BYTES); // length of A + B + C part

            System.out.println("locationStart: " + locationStart + ", which is the place of location's data start.");

            rao.writeInt(locationStart);

            // record place of C part start
            long indexStart = rao.getFilePointer();

            System.out.println("indexStart " + indexStart + ", which is the place of C part start.");

            // measure every location's length and write all location's data
            int startPointer = locationStart;
            rao.seek(startPointer); // jump to place of location's data start

            for(Location location : locations.values()) {
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());

                // retrieve Map of exits data (Map<String, Integer> exits)
                StringBuilder builder = new StringBuilder();
                for(String direction: location.getExits().keySet()) {
                    if(!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction); // get exits key
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                        // would like W,2,E,3,S,1,....
                    }
                }
                rao.writeUTF(builder.toString());

                // (rao.getFilePointer() - startPointer) end of location - start of location
                IndexRecord record = new IndexRecord(startPointer,(int) (rao.getFilePointer() - startPointer));
                index.put(location.getLocationID(), record); // put result to index map, so later C part could use it

                startPointer = (int) rao.getFilePointer(); // when current location was recorded, move pointer to the end of current location
            }

            // C part - index of location
            rao.seek(indexStart); // back to C part start
            for(Integer locationID: index.keySet()) {
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
         }

    }

    // 1. This first four bytes will contain the number of locations (bytes 0-3)
    // 2. The next four bytes will contain the start offset of the locations section (bytes 4-7)
    // 3. The next section of the file will contain the index (the index is 1692 bytes long.) It will start at byte 8 and end at byte 1699
    // 4. The final section of the file will contain the location records (the data). It will start at byte 1700

    static {
        try {
            ra = new RandomAccessFile("locations_rand.dat" , "rwd");

            //good practise to write the number of records at the beginning of a file
            //for future reference
            int numLocations = ra.readInt();
            long locationStartPoint = ra.readInt(); //offset of location section

            //reading the index
            //looping through until the file pointer reaches the location offset
            while (ra.getFilePointer() < locationStartPoint) {
                int locationId = ra.readInt();
                int locationStart = ra.readInt();
                int locationLength = ra.readInt();

                // creating the index record
                IndexRecord record = new IndexRecord(locationStart, locationLength);
                index.put(locationId, record);
            }

        } catch (IOException e) {
            System.out.println("IOException in static initializer: " + e.getMessage());
        }

//        try(ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
//            boolean eof = false;
//            while (!eof) {
//                try {
//                    Location location = (Location) locFile.readObject();
//                    System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
//                    System.out.println("Found " + location.getExits().size() + " exits");
//
//                    locations.put(location.getLocationID(), location);
//                } catch (EOFException e) {
//                    eof = true;
//                }
//            }
//        } catch(InvalidClassException e) {
//            System.out.println("InvalidClassException " + e.getMessage());
//        } catch(IOException io) {
//            System.out.println("IO Exception" + io.getMessage());
//        } catch(ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException " + e.getMessage());
//        }
//            while(!eof) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locID = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println("Read location " + locID + " : " + description);
//                    System.out.println("Found " + numExits + " exits");
//                    for(int i=0; i<numExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t\t" + direction + "," + destination);
//                    }
//                    locations.put(locID, new Location(locID, description, exits));
//
//                } catch(EOFException e) {
//                    eof = true;
//                }
//
//            }


//        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//
//        // Now read the exits
//        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
//            String input;
//            while((input = dirFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public Location getLocation(int locationId) throws IOException {
        //need to get the index record for this location
        IndexRecord record = index.get(locationId);
        //moving the file pointer to the locations offset
        ra.seek(record.getStartByte());
        //retrieving the location id
        //in case for some reason now you wanted to access it WITHOUT knowing the location id
        int id = ra.readInt();
        String description = ra.readUTF();
        String exits = ra.readUTF();
        //extracting exits into a string array
        String[] exitPart = exits.split(",");

        //create a new Location
        Location location = new Location(locationId, description, null); // null for exits, going to add those
        //send the exits
        if(locationId != 0) {
            //going to go through all the exits that we find and add to location
            for(int i = 0; i < exitPart.length; i++) {
                System.out.println("exitPart = " + exitPart[i]);
                System.out.println("exitPart[+1] = " + exitPart[i+1]);

                //grabbing just the actual direction for the location
                String direction = exitPart[i];
                //and then the destination
                int destination = Integer.parseInt(exitPart[++i]); //incrementing [i] first and then grabbing that element
//                because if you recall the exits is the actual word direction and then also the location id
//                where that direction goes to which room effectively or which location it leads to.
                // add direction and destination to the location
                location.addExit(direction, destination);
            }
        }
        return location;

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

    public void close() throws IOException {
        ra.close();
    }
}
