public class Count {
    public int totalCount;
    CountStrategy countStrategy;

    public Count(CountStrategy cs){
        countStrategy = cs;
    }
    
    public void count(Card c){
        totalCount += countStrategy.countUp(c);
    }

}
