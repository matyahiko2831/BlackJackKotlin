package model

/**
 *
 * カードクラス
 * @param suit マーク
 * @param index 表示
 * @param rank ランク
 * @param used 使用済み
 *
 * */
class Card(val suit: Suit, val index: String, val rank: Int, var used: Boolean = false){

    public override fun toString(): String {
        return "${suit}の${index}"
    }
}
