import java.util.ArrayList;
import java.util.Random;

public class Deck {
    //Attributes
    ArrayList<Card> cards = new ArrayList<Card>();

    //Consttructor
    public Deck(){
        int numberOfCards = 6;

        for (int i=0; i<numberOfCards; i++){
            cards.add(new Card(i));
        }

        pickCard();

    }

    //Methods
    public Card pickCard(){
        Random myRandom = new Random();
        Card myCard;
        //do {
            int pickedCard = myRandom.nextInt(cards.size());
            myCard = cards.get(pickedCard);
            System.out.println("Card " + pickedCard + " is " +myCard.isDiscarded());
        //} while(myCard.isDiscarded());
        return (myCard);

    }
}
