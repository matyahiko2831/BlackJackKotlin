package model

import java.util.Random
import exception.*

/**
 * デッキクラス
 * */
class Deck {

    /** デッキ残数 */
    private var remaining: Int = 52

    public val cards = arrayOf<Card>(
            Card(Suit.SPADE, "1", 1),
            Card(Suit.SPADE, "2", 2),
            Card(Suit.SPADE, "3", 3),
            Card(Suit.SPADE, "4", 4),
            Card(Suit.SPADE, "5", 5),
            Card(Suit.SPADE, "6", 6),
            Card(Suit.SPADE, "7", 7),
            Card(Suit.SPADE, "8", 8),
            Card(Suit.SPADE, "9", 9),
            Card(Suit.SPADE, "10", 10),
            Card(Suit.SPADE, "J", 10),
            Card(Suit.SPADE, "Q", 10),
            Card(Suit.SPADE, "K", 10),
            Card(Suit.HART, "1", 1),
            Card(Suit.HART, "2", 2),
            Card(Suit.HART, "3", 3),
            Card(Suit.HART, "4", 4),
            Card(Suit.HART, "5", 5),
            Card(Suit.HART, "6", 6),
            Card(Suit.HART, "7", 7),
            Card(Suit.HART, "8", 8),
            Card(Suit.HART, "9", 9),
            Card(Suit.HART, "10", 10),
            Card(Suit.HART, "J", 10),
            Card(Suit.HART, "Q", 10),
            Card(Suit.HART, "K", 10),
            Card(Suit.DIAMOND, "1", 1),
            Card(Suit.DIAMOND, "2", 2),
            Card(Suit.DIAMOND, "3", 3),
            Card(Suit.DIAMOND, "4", 4),
            Card(Suit.DIAMOND, "5", 5),
            Card(Suit.DIAMOND, "6", 6),
            Card(Suit.DIAMOND, "7", 7),
            Card(Suit.DIAMOND, "8", 8),
            Card(Suit.DIAMOND, "9", 9),
            Card(Suit.DIAMOND, "10", 10),
            Card(Suit.DIAMOND, "J", 10),
            Card(Suit.DIAMOND, "Q", 10),
            Card(Suit.DIAMOND, "K", 10),
            Card(Suit.CLUB, "1", 1),
            Card(Suit.CLUB, "2", 2),
            Card(Suit.CLUB, "3", 3),
            Card(Suit.CLUB, "4", 4),
            Card(Suit.CLUB, "5", 5),
            Card(Suit.CLUB, "6", 6),
            Card(Suit.CLUB, "7", 7),
            Card(Suit.CLUB, "8", 8),
            Card(Suit.CLUB, "9", 9),
            Card(Suit.CLUB, "10", 10),
            Card(Suit.CLUB, "J", 10),
            Card(Suit.CLUB, "Q", 10),
            Card(Suit.CLUB, "K", 10)
    )

    /**
     * カードドロー
     * デッキが0枚になったらException
     * @return Card
     * @throws DeckOutException
     * */
    public fun draw(role: Role, hide: Boolean = false): Card {

        while (true) {
            val card = cards[Random().nextInt(cards.size)]

            if(!card.used) {
                card.used = true;
                remaining--

                if(hide) {
                    println("${role}の引いたカードは分かりません。")
                } else {
                    println("${role}の引いたカードは${card}です。")
                }
                return card
            }

            if (remaining == 0) {
                // いらないけど例外の勉強のために
                throw DeckOutException("デッキ切れ")
            }
        }
    }

}
