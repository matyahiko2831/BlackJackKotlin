package model

class Card(val suit: Suit, val number: Int){

    public override fun toString(): String {
        return "マーク:%s, 数字:%s".format(suit, number)
    }
}
