public class uc2 {
    public static void main(String[] args) {
        Player player_1= new Player();
        System.out.println(player_1.dice());
    }
}
class Player {
    int position;
    int steps;
    Player() {
        this.position = 0;
        this.steps = 0;
    }
    public int dice(){
        return 1+(int)(Math.random()*6);
    }
}
