public class uc6 {

    public static void main(String[] args) {
        Player player_1= new Player();
        while(player_1.position<=100  ){
            player_1.yourTurn(1);
        }
        System.out.println(player_1.steps);
}
class Player{
    int position;
    int steps;
    Player() {
        this.position = 0;
        this.steps=0;
    }
    public int dice(){
        return 1+(int)(Math.random()*6);
    }
    public void move(int val ,int snakeOrLadder) {
        if (snakeOrLadder == 0) this.position= Math.max(this.position - val, 0);
        else if (snakeOrLadder == 1 && (this.position + val) <= 100) this.position+= val;
    }
    public void  yourTurn(int snakeOrLadder){
        while(snakeOrLadder==1) {
            this.steps+=1;
            int val = dice();
            snakeOrLadder = (int) (Math.random() * 3);
            move(val, snakeOrLadder);
