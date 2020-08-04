// Fig. 7.11 DeckOfCardsTest.java
// Card shuffling and dealing

public class DeckOfCardsTest
{
    // execute application
    public static void main( String[] args )
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order
        
        // print all 52 cards in the order in which they were dealt
        for ( int i = 1; i <= 52; i++ )
        {
            // deal and display a card
            System.out.printf( "%-19s", myDeckOfCards.dealCard() );
            
            if ( i % 4 == 0 ) // output a newline after eevery fourth card
                System.out.println();
        } // end for
    } // end main
} // end class DeckOfCardsTest