import java.util.ArrayList;

public class Table {
    class Seat{
        Player player; 
        int betAmount = 0;
        public Seat(Player p){
            this.player = p;
        }
    }
  
    public int maxSlots;
    public ArrayList<Seat> seats;
    public Deck deck;
    public Dealer dealer;


    public Table(int maxSlots, int numDecks){
        this.maxSlots = maxSlots;
        this.seats = new ArrayList<Seat> (maxSlots);
        this.deck = new Shoe(numDecks);
        this.dealer = new Dealer(this.deck);
    }

    public void addPlayer(Player player){
        Seat seat = new Seat(player);
        seats.add(seat);
    }
    
}
