public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Aloe");
        Team team2 = new Team("Gre");
        Team team3 = new Team("Aty");
        Team team4 = new Team("Sbd");
        Team team5 = new Team("Ver");



        LeagueTable<Team> table = new LeagueTable<>("Power");
        LeagueTable<Team> tableS = new LeagueTable<>("Gen");


        table.addPlayer(team1);
        table.addPlayer(team2);
        table.addPlayer(team3);
        table.addPlayer(team4);

        tableS.addPlayer(team1);
        tableS.addPlayer(team2);
        tableS.addPlayer(team3);
        tableS.addPlayer(team4);
        tableS.addPlayer(team5);

        table.ranking();
//        System.out.println(table.compareTo(tableS));
    }
}