public class HiLow implements CountStrategy{

    public int totalCount;

    public int countUp(Card c){
        if(c.Rank.rank <= 6){
            totalCount += 1;
        }
        else if(c.Rank.rank >= 10){
            totalCount -= 1;
        }
        return totalCount;
    }
}
