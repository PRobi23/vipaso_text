import action.ScoreCalculationAction
import data.Card
import data.Suit
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class ScoreCalculationAction {

    private val sut = ScoreCalculationAction()

    @Test
    fun `if there is no card return an exception`() {
        // given

        // when

        // then
        assertThrows<NullPointerException> { sut.calculateScore(emptyList()) }
    }


    @Test
    fun `if there is no specific score return 1`() {
        // given
        val expected = 1

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithHighCard()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `test get getNumberOfSpecificCards`() {
        // given
        val expected = mapOf(
            "2" to 2,
            "4" to 1,
            "6" to 1,
            "8" to 1
        )

        // when
        val keyValues = sut.getNumberOfSpecificCards(
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
        )

        // then
        assertEquals(expected, keyValues)
    }

    @Test
    fun `if there is a pair score return 2`() {
        // given
        val expected = 2

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithPair()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there has two pair score return 3`() {
        // given
        val expected = 3

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithTwoPair()
        )

        // then
        assertEquals(expected, score)
    }


    @Test
    fun `if there is a triple score return 4`() {
        // given
        val expected = 4

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithTriple()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a low straight score return 5`() {
        // given
        val expected = 5

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithLowStraight()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a high straight score return 5`() {
        // given
        val expected = 5

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithHighStraight()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a flush score return 6`() {
        // given
        val expected = 6

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithFlush()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a full house score is  7`() {
        // given
        val expected = 7

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithFullHouse()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a poker score is  8`() {
        // given
        val expected = 8

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithPoker()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a straight flush score is 9`() {
        // given
        val expected = 9

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithStraightFlush()
        )

        // then
        assertEquals(expected, score)
    }

    @Test
    fun `if there is a royal flush score is 9`() {
        // given
        val expected = 9

        // when
        val score = sut.calculateScore(
            CardGenerator.generateCardsWithHighRoyalFlush()
        )

        // then
        assertEquals(expected, score)
    }

}