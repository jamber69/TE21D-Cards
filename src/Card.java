public class Card {
    //Attributes
    private String color;
    private int value;
    private boolean discarded = false;

    //Constructor
    public Card(int value){
        this.value = value;
    }

    //Getters & Setters


    public boolean isDiscarded() {
        return discarded;
    }
}
