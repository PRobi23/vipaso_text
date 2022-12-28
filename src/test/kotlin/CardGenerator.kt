import data.Card
import data.Suit

object CardGenerator {

    fun generateCardsWithHighCard() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "3", Suit.DIAMONDS
            ),
            Card(
                "4", Suit.HEARTS
            ),
            Card(
                "6", Suit.SPADES
            ),
            Card(
                "8", Suit.SPADES
            )
        )

    fun generateCardsWithPair() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "2", Suit.DIAMONDS
            ),
            Card(
                "4", Suit.HEARTS
            ),
            Card(
                "6", Suit.SPADES
            ),
            Card(
                "8", Suit.SPADES
            )
        )

    fun generateCardsWithTwoPair() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "2", Suit.DIAMONDS
            ),
            Card(
                "4", Suit.HEARTS
            ),
            Card(
                "4", Suit.SPADES
            ),
            Card(
                "8", Suit.SPADES
            )
        )

    fun generateCardsWithTriple() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "2", Suit.DIAMONDS
            ),
            Card(
                "2", Suit.HEARTS
            ),
            Card(
                "6", Suit.SPADES
            ),
            Card(
                "8", Suit.SPADES
            )
        )

    fun generateCardsWithHighStraight() =
        listOf(
            Card(
                "9", Suit.CLUBS
            ),
            Card(
                "10", Suit.DIAMONDS
            ),
            Card(
                "J", Suit.HEARTS
            ),
            Card(
                "Q", Suit.SPADES
            ),
            Card(
                "K", Suit.SPADES
            )
        )

    fun generateCardsWithLowStraight() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "3", Suit.DIAMONDS
            ),
            Card(
                "4", Suit.HEARTS
            ),
            Card(
                "5", Suit.SPADES
            ),
            Card(
                "6", Suit.SPADES
            )
        )

    fun generateCardsWithFlush() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "3", Suit.CLUBS
            ),
            Card(
                "4", Suit.CLUBS
            ),
            Card(
                "6", Suit.CLUBS
            ),
            Card(
                "8", Suit.CLUBS
            )
        )


    fun generateCardsWithFullHouse() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "2", Suit.SPADES
            ),
            Card(
                "10", Suit.HEARTS
            ),
            Card(
                "10", Suit.DIAMONDS
            ),
            Card(
                "10", Suit.CLUBS
            )
        )

    fun generateCardsWithPoker() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "2", Suit.SPADES
            ),
            Card(
                "2", Suit.HEARTS
            ),
            Card(
                "2", Suit.DIAMONDS
            ),
            Card(
                "10", Suit.CLUBS
            )
        )

    fun generateCardsWithHighRoyalFlush() =
        listOf(
            Card(
                "9", Suit.CLUBS
            ),
            Card(
                "10", Suit.CLUBS
            ),
            Card(
                "J", Suit.CLUBS
            ),
            Card(
                "Q", Suit.CLUBS
            ),
            Card(
                "K", Suit.CLUBS
            )
        )

    fun generateCardsWithStraightFlush() =
        listOf(
            Card(
                "2", Suit.CLUBS
            ),
            Card(
                "3", Suit.CLUBS
            ),
            Card(
                "4", Suit.CLUBS
            ),
            Card(
                "5", Suit.CLUBS
            ),
            Card(
                "6", Suit.CLUBS
            )
        )
}