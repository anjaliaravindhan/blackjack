import java.util.Random;

public class RandomBetStrategy implements BetStrategy{
    public int betAmount(int count){
        Random rand = new Random();
        return rand.nextInt(91) + 10;
    }
    
}
