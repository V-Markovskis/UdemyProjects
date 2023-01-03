package academy.learnprogramming;

public class Room {
    private Bed sleepingBad;
    private Table table;
    private TV television;
    private Locker locker;

    public Room(Bed sleepingBad, Table table, TV television, Locker locker) {
        this.sleepingBad = sleepingBad;
        this.table = table;
        this.television = television;
        this.locker = locker;
    }

    public void infoFromBed() {
        sleepingBad.emotionsFromBed();
        infoFromTv();
    }

    private void infoFromTv() {
        television.tvProgram();
    }

//    public Bed getSleepingBad() {
//        return SleepingBad;
//    }
//
//    public Table getTable() {
//        return table;
//    }
//
//    public TV getTelevision() {
//        return television;
//    }
//
//    public Locker getLocker() {
//        return locker;
//    }
}
