public class Shoe extends Deck{
    public Shoe(int deckNum){
        cards.clear();
        for(int x = 0;  x < deckNum; x++){
            Deck deck = new Deck();
            cards.addAll(deck.cards);
        }
        this.shuffleDeck();
    }
}
