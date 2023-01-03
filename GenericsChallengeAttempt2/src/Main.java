public class Main {
    public static void main(String[] args) {
        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>("ASD");

        Team<FootballPlayer> team1 = new Team<>("Lego1");
        Team<FootballPlayer> team2 = new Team<>("Lego2");
        Team<FootballPlayer> team3 = new Team<>("Lego3");
        Team<FootballPlayer> team4 = new Team<>("Lego4");

        footballLeague.addTeams(team1);
        footballLeague.addTeams(team2);
        footballLeague.addTeams(team3);
        footballLeague.addTeams(team4);

        team1.matchResult(team2, 1, 3);
        team3.matchResult(team4,2,3);

        footballLeague.showLeagueTable();

    }
}