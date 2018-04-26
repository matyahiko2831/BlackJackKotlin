package model

class Card {
    Suit suit
    int number

    public override fun toString(): String {
        return "マーク:%s, 数字:%s".format(suit, number)
    }
}
