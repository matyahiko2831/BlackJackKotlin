package model



class User {

    var hand = arrayListOf<Card>()

    public fun getScore(): Int {

        var score = 0

        for (card in hand) {
            score += card.number
        }

        return  score
    }
}
