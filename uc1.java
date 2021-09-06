public class uc1 {
    public static void main(String[] args) {
        Player player_1= new Player();
        System.out.println(player_1.position);
    }
}
class Player {
    int position;
    int steps;
    Player() {
        this.position = 0;
        this.steps = 0;
    }
}
