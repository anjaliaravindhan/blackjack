import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand = new ArrayList<Card>();
    private int betAmount = 0;
    public Player(){
        
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public String toString(){
        String res = "";
        for(int a = 0; a < hand.size(); a++){
            res += hand.get(a) + "\n";
        }
        return res + betAmount;
    }

    public void bet(int bet){
        betAmount += bet;
    }

  
    
}
