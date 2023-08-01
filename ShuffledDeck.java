import java.util.Collections;

public class ShuffledDeck extends Deck{

    public ShuffledDeck(){
        super();
        Collections.shuffle(cards);

    }
}
