import java.util.ArrayList;

public class Player {

    public ArrayList<Card> hand = new ArrayList<Card>();
    public int cash = 0;
    public String name; 

    public Player(int startingCash, String playerName){
        cash = startingCash;
        this.name = playerName;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public String toString(){
        String res = "";
        for(int a = 0; a < hand.size(); a++){
            res += hand.get(a) + "\n";
        }
        return res + "$" + cash;
    }

    public void bet(int bet){
        cash -= bet;
    }

  
    
}
