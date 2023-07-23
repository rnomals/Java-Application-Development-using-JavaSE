import java.util.Random;
import java.util.Scanner;

public class RollADiceGame {
    public static void main(String[] args){
        int player1score = 0;
        int player2score = 0;
        int winningscore = 100;

        boolean isPlaying = true;

        Random random = new Random();

        for(int i = 0; i < 50; i++){
            int rand = random.nextInt(6)+1;
            System.out.println(rand);
        }

    }
}
