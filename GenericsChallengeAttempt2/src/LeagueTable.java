import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;

    public LeagueTable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ArrayList<T> leagueMembers = new ArrayList<>();

    public boolean addTeams(T team) {
        if(leagueMembers.contains(team)) {
            System.out.println(team.getName() + " already added");
            return false;
        } else {
            leagueMembers.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(leagueMembers);
        for(T team : leagueMembers) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
