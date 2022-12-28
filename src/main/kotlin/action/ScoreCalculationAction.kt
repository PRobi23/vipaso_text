package action

import data.Card
import org.jetbrains.annotations.TestOnly

class ScoreCalculationAction {

    fun calculateScore(cards: List<Card>): Int {
        if (cards.isEmpty()) {
            throw NullPointerException()
        }
        val cardWithNumbers = getNumberOfSpecificCards(cards)
        val pairNumbers = cardWithNumbers.values.count { it == 2 }
        val hasTriple = cardWithNumbers.containsValue(3)
        val hasPoker = cardWithNumbers.containsValue(4)
        val hasFlush = cards.distinctBy { it.suit }.count() == 1

        return when {
            pairNumbers == 1 -> {
                if (hasTriple) {
                    return 7
                } else 2
            }

            pairNumbers == 2 -> 3
            hasTriple -> 4
            detectStraight(cards) -> {
                if (hasFlush) {
                    return 9
                }
                return 5
            }

            hasFlush -> 6
            hasPoker -> 8
            else -> 1
        }

    }

    @TestOnly
    fun getNumberOfSpecificCards(cards: List<Card>): Map<String, Int> {
        val keyValues = mutableMapOf<String, Int>()
        cards.forEach { card ->
            if (keyValues.containsKey(card.score)) {
                val numberOfCard = keyValues[card.score]
                numberOfCard?.let {
                    keyValues[card.score] = it + 1

                }
            } else {
                keyValues[card.score] = 1
            }
        }

        return keyValues
    }

    private fun detectStraight(cards: List<Card>): Boolean {
        cards.forEachIndexed { index, card ->
            val actualScore = card.toScore()
            if (cards[index + 1].toScore() != actualScore + 1) {
                return false
            }
            if (index == cards.count() - 2) {
                return true
            }
        }
        return false
    }
}