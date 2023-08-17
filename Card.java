public class Card {
    public Rank Rank;
    public Suit Suit;

    public String toString(){
        return this.Rank + " " + this.Suit;
    }

    public Card(Rank x, Suit y){
        Rank = x;
        Suit = y;
    }
    
    public Rank getRank(){
        return Rank;
    }
    public Suit getSuit(){
        return Suit;
    }


}
