public class Main {
    public static void main(String[] args) {
        BlackjackGame game1 = new BlackjackGame(3, 100);
        Player player1 = new Player(100, "Anjali", new Basic50BetStrategy());
        Player player2 = new Player(100, "Luke", new RandomBetStrategy());

        game1.addPlayer(player1);
        game1.addPlayer(player2);

        game1.round();
        //game1.round();

    }
}

/*
 * 1. Takes into account negative cash and plays indefinitely until 1 player is
 * left
 */
