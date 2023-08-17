public class IncreasingBetStrategy implements BetStrategy {
    int x = 0;
    public int betAmount(int count){
        return x += 50;
    }
}
