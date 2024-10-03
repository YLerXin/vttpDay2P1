package project;

public class Main {

    public static void main(String[] args){
        DeckT deck = new DeckT();
        Card card = deck.get(5);
        System.out.printf("Suit: %s, Name: %s, Values: %d,",card.getSuit(),card.getName(),card.getValue());
        System.out.println(card);
    }
    
}
