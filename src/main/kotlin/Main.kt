import action.ScoreCalculationAction
import repository.CardRepositoryImpl

fun main(args: Array<String>) {
    val cards = CardRepositoryImpl().generateCards()
    val score = ScoreCalculationAction().calculateScore(cards)

    println(cards)
    println(score)
}