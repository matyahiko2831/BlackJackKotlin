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
            Card(Suit.SPADE, 1),
            Card(Suit.SPADE, 2),
            Card(Suit.SPADE, 3),
            Card(Suit.SPADE, 4),
            Card(Suit.SPADE, 5),
            Card(Suit.SPADE, 6),
            Card(Suit.SPADE, 7),
            Card(Suit.SPADE, 8),
            Card(Suit.SPADE, 9),
            Card(Suit.SPADE, 10),
            Card(Suit.SPADE, 11),
            Card(Suit.SPADE, 12),
            Card(Suit.SPADE, 13),
            Card(Suit.HART, 1),
            Card(Suit.HART, 2),
            Card(Suit.HART, 3),
            Card(Suit.HART, 4),
            Card(Suit.HART, 5),
            Card(Suit.HART, 6),
            Card(Suit.HART, 7),
            Card(Suit.HART, 8),
            Card(Suit.HART, 9),
            Card(Suit.HART, 10),
            Card(Suit.HART, 11),
            Card(Suit.HART, 12),
            Card(Suit.HART, 13),
            Card(Suit.DIAMOND, 1),
            Card(Suit.DIAMOND, 2),
            Card(Suit.DIAMOND, 3),
            Card(Suit.DIAMOND, 4),
            Card(Suit.DIAMOND, 5),
            Card(Suit.DIAMOND, 6),
            Card(Suit.DIAMOND, 7),
            Card(Suit.DIAMOND, 8),
            Card(Suit.DIAMOND, 9),
            Card(Suit.DIAMOND, 10),
            Card(Suit.DIAMOND, 11),
            Card(Suit.DIAMOND, 12),
            Card(Suit.DIAMOND, 13),
            Card(Suit.CLUB, 1),
            Card(Suit.CLUB, 2),
            Card(Suit.CLUB, 3),
            Card(Suit.CLUB, 4),
            Card(Suit.CLUB, 5),
            Card(Suit.CLUB, 6),
            Card(Suit.CLUB, 7),
            Card(Suit.CLUB, 8),
            Card(Suit.CLUB, 9),
            Card(Suit.CLUB, 10),
            Card(Suit.CLUB, 11),
            Card(Suit.CLUB, 12),
            Card(Suit.CLUB, 13)
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
                    println("%sの引いたカードは分かりません。".format(role))
                } else {
                    println("%sの引いたカードは%sです。".format(role, card))
                }
                return card
            }

            if (remaining == 0) {
                throw DeckOutException("デッキ切れ")
            }
        }
    }

}
