/*
 * RandomCard.java
 * -------------------
 * Displays the name of a card randomly chosen from a complete deck of 52 
 * playing cards.
 */

// extends base number class
 public class RandomCard extends BaseNumber{
    /* Instance Variables */

// sets up array for suits and card numbers/names
    public String Result(){
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace" };

// object instance for range 
        BaseNumber range = new BaseNumber();
        BaseNumber range2 = new BaseNumber();

// return cards for both
       return cards[range.rand(13)]
            + " of " +suits[range2.rand(4)];
    }
}