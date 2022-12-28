package data

data class Card(
    val score: String,
    val suit: Suit
) {
    fun toScore(): Int {
        return if (score.chars().allMatch { Character.isDigit(it) }) {
            score.toInt()
        } else {
            when (score) {
                "J" -> {
                    11
                }

                "Q" -> {
                    12
                }

                "K" -> {
                    13
                }

                else -> 14
            }
        }
    }
}