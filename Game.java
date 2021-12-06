public class Game {

    public static void main(String[] args) {

        Team t = new Team("New time");

        int[] barriers = new int[2];
        barriers[0] = 230;
        barriers[1] = 120;

        Course c = new Course(barriers);

        System.out.println(t.nameTeam);
        t.allPlayers();
        c.start(t);
        System.out.println("Победители:");
        t.winPlayers();
    }
}

