// Fig 7.9 Card.java
// Card class represents a playing card

public class Card
{
    private String face; // face of card ("Ace", "Deuce", ...)
    private String suit; // suit of a card ("Hearts", "Diamonds", ...)
    
    // two argument constructor initializes card's face and suit
    public Card ( String cardFace, String cardSuit )
    {
        face = cardFace; // initalizes face of card
        suit = cardSuit; // initalizes suit of card
    } // end constructor
    
    public String toString()
    {
        return face + " of " + suit;
    } // end method toString
} // end class Card