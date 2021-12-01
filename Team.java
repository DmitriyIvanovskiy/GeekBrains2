public class Team {

    String nameTeam;
    String[] players = new String[4];

    public Team() {
        players[0] = "Fedor Ivanovich";
        players[1] = "Igor Ivanovich";
        players[2] = "Denis Ivanovich";
        players[3] = "Oleg Ivanovich";

    }
    public void allPlayers(){
        for (int i=0; i < players.length; i++){
            System.out.println(players[i]);
        }
    }
    public void winPlayers() {
    }
}
