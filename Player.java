import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand = new ArrayList<Card>();
    private int cash = 0;
    public Player(int startingCash){
        cash = startingCash;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public String toString(){
        String res = "";
        for(int a = 0; a < hand.size(); a++){
            res += hand.get(a) + "\n";
        }
        return res + cash;
    }

    public void bet(int bet){
        cash -= bet;
    }

  
    
}
