package project;

public class Main {

    //suffle the deck

    public static void main(String[] args){
        DeckT deck = new DeckT();
        Card card = deck.get(5);
        System.out.printf("Suit: %s, Name: %s, Values: %d,",card.getSuit(),card.getName(),card.getValue());
        System.out.println(card);

        //print deck
        // for (int i=0; i<52;i++){
        //     System.out.println(deck.get(i));
        // }
        deck.shuffle();
        Card[] shuffledDeck = deck.getDeck();  // Get the shuffled deck

        for (int i = 0; i < shuffledDeck.length; i++) {
            System.out.println(shuffledDeck[i]);  // Assuming 'Card' has a proper toString() method to display the card
        }
    }
    
}
