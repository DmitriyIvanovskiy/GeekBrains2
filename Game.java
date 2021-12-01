public class Game {

    public static void main (String[] args){

        Team t = new Team();
        Course c = new Course();

        t.allPlayers();
        c.start(t);
    }

}

