import java.util.ArrayList;
import java.util.Collections;

public class Deck{

    ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(){

        for (Suit suit :  Suit.values()){
             for (Rank rank : Rank.values()){
                Card card1 = new Card(rank, suit);
                cards.add(card1);
             }
        }

    }
    

    public Card deal(){
        return cards.remove(0);
    }

    public String toString(){
        String res = "";
        for(int a = 0; a < cards.size(); a++){
            res += cards.get(a) + "\n";
        }
        return res;
    } 

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }
   
}
