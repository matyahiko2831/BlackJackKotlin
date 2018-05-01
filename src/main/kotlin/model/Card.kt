package model

/**
 *
 * カードクラス
 * @param suit マーク
 * @param number 数字
 * @param used 使用済み
 *
 * */
class Card(val suit: Suit, val number: Int, var used: Boolean = false){

    public override fun toString(): String {
        return "マーク:%s, 数字:%s, 使用済み:%s".format(suit, number, used)
    }
}
