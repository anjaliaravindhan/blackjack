import java.util.ArrayList;
public class Shoe extends Deck{
    public Shoe(int deckNum){
        ArrayList<Card> temp =  new ArrayList<Card>();
        for(int x = 0;  x < deckNum; x++){
            temp.addAll(cards);
        }
        cards = temp;
    }
}
