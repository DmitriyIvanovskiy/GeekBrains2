public class Team {

    String nameTeam;
    Player[] players = new Player[4];

    public Team(String nameTeam) {
        players[0] = new Player("Fedor Ivanovich", 200);
        players[1] = new Player("Igor Ivanovich", 123);
        players[2] = new Player("Denis Ivanovich", 234);
        players[3] = new Player("Oleg Ivanovich", 453);
        this.nameTeam = nameTeam;

    }

    public void allPlayers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }

    public void winPlayers() {
        for (int i = 0; i < players.length; i++) {
            if (players[i].isWinner) {
                System.out.println(players[i]);
            }
        }
    }
}

