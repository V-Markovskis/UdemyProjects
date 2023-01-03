package academy.learnprogramming;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> write();
    void read(ArrayList<String> write);
}
