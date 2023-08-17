import java.util.ArrayList;

public class Player {

    public ArrayList<Card> hand = new ArrayList<Card>();
    public int cash = 0;
    public String name; 
    private BetStrategy betStrategy;

    public Player(int startingCash, String playerName, BetStrategy b){
        cash = startingCash;
        this.name = playerName;
        this.betStrategy = b;
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

    public int bet(){
        int betAmount = betStrategy.betAmount(0);
        cash -= betAmount;
        return betAmount;
    }

    public int getValueOfHand(){
        int total = 0;
        for(int a = 0; a < hand.size(); a++){
            if(hand.get(a).Rank.rank == 14){
                total += 11;
            }
            else if(hand.get(a).Rank.rank >= 10){
                total += 10;
            }
            else {
                total += hand.get(a).Rank.rank;
            } 
        }
        return total;
    }

    public void play(Dealer d){
        while(getValueOfHand() < 17 && hand.size() < 5){
            hand.add(d.deal());
        }
    }

  
    
}
