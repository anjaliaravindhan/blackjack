import java.util.ArrayList;

public class BlackjackGame {
    public Table table;

    public BlackjackGame(int maxSlots, int numDecks){
        this.table = new Table(maxSlots,numDecks);
    }

    public void addPlayer(Player p){
        table.addPlayer(p);
    }

    public void betRound(){
        for(Table.Seat seat : table.seats){
            seat.collectBets();
        }
    }

    public void initialRound(){
        for(Table.Seat seat : table.seats){
           table.deal(seat);
           table.deal(seat);
        }
        table.dealer.addCard(table.dealer.deal());
        table.dealer.addCard(table.dealer.deal());
    }

    public void newRound(){
        for(Table.Seat seat : table.seats){
            seat.player.play(table.dealer);
        }
        table.dealer.play(table.dealer);
    }

    public void tallyUp(){
        for(Table.Seat seat : table.seats){
            if(seat.player.getValueOfHand() > 21){
                seat.betAmount = 0;
            }
            else if(table.dealer.getValueOfHand() > 21){
                seat.player.cash += seat.betAmount * 2;
                seat.betAmount = 0;
            }
            else if (seat.player.getValueOfHand() > table.dealer.getValueOfHand()){
                seat.player.cash += seat.betAmount * 2;
                seat.betAmount = 0;
            }
            else if (seat.player.getValueOfHand() < table.dealer.getValueOfHand()){
                seat.betAmount = 0;
            }
            else if (seat.player.getValueOfHand() == table.dealer.getValueOfHand()){
                seat.player.cash += seat.betAmount;
                seat.betAmount = 0;
            }
        }
    }

    public void winnerCalculation(){
        ArrayList<Table.Seat> seatsToBeRemoved = new ArrayList<Table.Seat>();
        for(Table.Seat seat : table.seats){
            if(seat.player.cash <= 0){
                seatsToBeRemoved.add(seat);
            }
        }
        table.seats.removeAll(seatsToBeRemoved);
    }

    public void clear(){
        for(Table.Seat seat : table.seats){
            seat.player.hand.clear();
        }
        table.dealer.hand.clear();
    }

    public void round(){
        betRound();
        initialRound();
        newRound();
        tallyUp();
        System.out.println(table);
        winnerCalculation();
        clear();
    }

 /*
  *  hand > 21 automatic loss
  *  dealer > 21 automatic win
  *  hand > dealer win
  *  hand < dealer loss
  *  hand = dealer nothing
  */

    
    
}
