public class Dealer extends Player{
    
    Deck deck;

    public Dealer(Deck deck){
        super(Integer.MAX_VALUE, "Dealer");
        this.deck = deck;
    }

    public Card deal(){
       return deck.deal();
    }

}
