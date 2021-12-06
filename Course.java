public class Course {

    int[] barriers;

    public Course(int[] barriers) {
        this.barriers = barriers;
    }

    public void start(Team team) {
        int allDistance = 0;
        for (int barrier : barriers) {
            allDistance += barrier;
        }
        for (Player player : team.players) {
            if (allDistance <= player.maxDistance) {
                player.isWinner = true;
            }
        }
    }
}
