public class Dealer extends Player{
    
    Deck deck;
    Count count = new Count(new HiLow());

    public Dealer(Deck deck){
        super(Integer.MAX_VALUE, "Dealer", null);
        this.deck = deck;
    }

    public Card deal(){
        Card c = deck.deal();
        count.count(c);
        System.out.println("Total count: " + count.totalCount);
       return c;
    }

}
