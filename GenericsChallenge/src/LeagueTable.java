import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> implements Comparable<LeagueTable <T>> {
    private String name;
    int won = 0;
    int tied = 0;

    public LeagueTable(String name) {
        this.name = name;
    }

    private ArrayList<T> members = new ArrayList<>();

    public boolean addPlayer(T team) {
        if(members.contains(team)) {
            System.out.println("Already added");
            return false;
        } else {
            members.add(team);
            return true;
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(LeagueTable<T> leagueTable) {
        if(this.ranking() > leagueTable.ranking()) {
            return -1;
        } else if (this.ranking() < leagueTable.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
