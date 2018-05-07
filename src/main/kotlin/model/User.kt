package model



class User {

     /** 手札 */
    var hand = arrayListOf<Card>()

    /**
     * @return Int 得点
     * */
    public fun getScore(): Int {

        var score = 0

        for (card in hand) {
            score += card.number
        }

        return  score
    }

    /**
     *
     * バーストしているか
     * バースト:得点が21点を超えている
     *
     * @return Boolean
     */
    public fun isBurst(): Boolean {
        return this.getScore() > 21
    }
}
