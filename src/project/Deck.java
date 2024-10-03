package project;

import java.util.Random;
import java.io.Console;

public class Deck {

    String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] deck = new String[52];
    String[] suits = {"heart","club","spade","diamond"};

    public void generatecards(){
        int index = 0;
        for(int a=0;a<ranks.length;a++){
            for(int b=0;b<suits.length;b++){
                deck[index] = ranks[a] + "-" + suits[b];
                index++;
            }
        }
    }
    public void generatedeck(){

        Random rand = new Random();
    for (int i = 0; i < deck.length; i++) {
			int randomIndexToSwap = rand.nextInt(deck.length);
			String temp = deck[randomIndexToSwap];
			deck[randomIndexToSwap] = deck[i];
			deck[i] = temp;
		}

    }
    public String[] getDeck() {
        return deck;
    }

    public static void main(String[] args){
        Deck deck = new Deck();
        Console cons = System.console();
        String input = cons.readLine("Do you want to play a game?\n"+">");

        boolean brk = false;

        //generate first as the cards must be outside the loop

        deck.generatecards();
        deck.generatedeck();
        String[] cards = deck.getDeck();
        String[] hand = new String[52];

        while (brk == false){
        switch(input.trim().toLowerCase()){
            case "yes": 
            String newinput = cons.readLine("How many Cards to draw?\n"+">");
            int newinputint = Integer.parseInt(newinput);
            //String[] hand = new String[newinputint];


            for (int a = 0; a < newinputint;a++){
                hand[a] = cards[a];
                cards[a] = null;
            }
            System.out.println("Here is your hand\n " );
            for (int j = 0; j < hand.length; j++) {
                if (hand[j]!=null){
                System.out.println(hand[j]);
            };
             }
            input = cons.readLine("What else do you want to do?\n"+">");
            break;

            case "reshuffle": deck.generatedeck();
            cards = deck.getDeck(); 
            System.out.println("Deck has been reshuffled");
            input = cons.readLine("What else do you want to do?\n"+">");
            break;      

            //to show the deck print
            case "show deck":
            for (int i = 0; i < cards.length; i++) {
                if (cards[i]!=null){
                System.out.println(cards[i]);};
             } 
            System.out.println("Deck is as follows");
            input = cons.readLine("What else do you want to do?\n"+">");
            break;
            
            // case "count deck":
            // int count = 0;
            // for (int i = 0; i < cards.length; i++) {
            //     if (cards[i]!=null){
            //         count++;
            //  }
            //  System.out.printf("you have %d cards in the deck",count);} 
            //  break;
            //  case "count hand":
            //  count = 0;
            //  for (int i = 0; i < hand.length; i++) {
            //      if (hand[i]!=null){
            //          count++;
            //   }
            //   System.out.printf("you have %d cards in your hand",count);} 
            //   break;

            case "show hand":
            for (int i = 0; i < hand.length; i++) {
                if (hand[i]!=null){
                System.out.println(hand[i]);};
             } 
            System.out.println("hand is as follows");
            input = cons.readLine("What else do you want to do?\n"+">");
            break;   

            case "no": System.out.println("Im out"); 
            brk = true;
            break;

            default:
             System.out.println("Well Goodbye");
             brk = true;
            break;
        }
        }









    }
}
