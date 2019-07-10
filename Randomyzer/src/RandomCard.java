/*
 * RandomCard.java
 * -------------------
 * Displays the name of a card randomly chosen from a complete deck of 52 
 * playing cards.
 */

 import java.util.Random;

 public class RandomCard{
    /* Instance Variables */
    public String Result(){
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace" };
        Random random = new Random();
       return cards[random.nextInt(cards.length)]
            + " of " +suits[random.nextInt(suits.length)];
    }
}