public class Player {

    String name;
    int maxDistance;
    boolean isWinner;

    public Player(String name, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.isWinner = false;
    }

    @Override
    public String toString() {
        return "Player {" +  "name = " + name  + '}';
    }
}
