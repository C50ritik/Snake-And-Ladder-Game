public class uc3 {
    public static void main(String[] args) {
        Player player_1= new Player();
        int val = player_1.dice();
        int snakeOrLadder = (int) (Math.random() * 3);
        player_1.move(val, snakeOrLadder);
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
    public int dice(){
        return 1+(int)(Math.random()*6);
    }
    public void move(int val ,int snakeOrLadder) {
        if (snakeOrLadder == 0) this.position= Math.max(this.position - val, 0);
        else if (snakeOrLadder == 1 && (this.position + val) <= 100) this.position+= val;
    }
}
