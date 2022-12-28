package repository

import data.Card
import data.Suit
import kotlin.random.Random

class CardRepositoryImpl : CardRepository {
    override fun generateCards(): List<Card> {
        val cards = mutableListOf<Card>()
        for (i in 1..5) {
            cards.add(CardGenerator.createCard())
        }
        return cards
    }
}

interface CardRepository {
    fun generateCards(): List<Card>
}

object CardGenerator {
    fun createCard() =
        Card(
            score = generateScore(),
            suit = generateSuit()
        )

    private fun generateScore(): String {
        val allowedChars = setOf("T", "Q", "A", "K", "J") + ("2".."10")
        return allowedChars.random().toString()
    }

    private fun generateSuit(): Suit {
        return Suit.values()[Random.nextInt(4)]
    }
}