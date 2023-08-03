public class Main {
    public static void main(String[] args) {
          Shoe total = new Shoe(2);
          Deck deck = new Deck();
          Dealer dealer = new Dealer(total);
          System.out.println(dealer.deal());
          System.out.println(dealer.deal());
          System.out.println(dealer.deal());
          System.out.println(dealer.deal());
          dealer.deck = deck;
          System.out.println("==================");
          System.out.println(dealer.deal());
          System.out.println(dealer.deal());
          System.out.println(dealer.deal());
          System.out.println(dealer.deal());
          Player player1 = new Player(1000);
          Table table = new Table(4, 4);
          table.addPlayer(player1);
        
    }
}

/* 1. add name to player class (and dealer) as well as the toString
*  2. print out Table class (print out current state --> seat position has (cards) and (bet amount))
*  3. rename Rank to Jack, Queen, King, Ace
*/
