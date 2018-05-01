package hello

import model.*
import exception.*

fun main(args: Array<String>) {
    println("☆★☆☆★☆ブラックジャックへようこそ！☆★☆☆★☆")
    println("ゲームを開始します")

    var deck = Deck()

    while (true) {
        try {
            println("あなたの引いたカードは%sです。".format(deck.draw()))
            println("ディーラーの引いたカードは%sです。".format(deck.draw()))
        } catch (e: DeckOutException) {
            println(e.message)
            System.exit(0);
        }
    }

    println("ブラックジャック終了！また遊んでね★")
}
