package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        TV tv = new TV("GS 1044R","Asus",5, resolution);

        Key key = new Key("Brown", "Steel", 1);
        Dimensions dimensions = new Dimensions(100,180, 45);
        Locker locker = new Locker(500,"Wood",4, dimensions,key);

        Bed bed = new Bed(400,300,"Morgan");
        Table table = new Table(101, 44,22,"Plastic");

        Room houseRoom = new Room(bed,table,tv,locker);

        houseRoom.infoFromBed();

        /*houseRoom.getTable().tableHeightChange(2);
        houseRoom.getTelevision().onOrOff(false);
        houseRoom.getLocker().isKeyOnSamePosition();*/
    }
}
