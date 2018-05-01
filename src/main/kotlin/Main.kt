package hello

import model.*
import exception.*

fun main(args: Array<String>) {

    println("☆★☆☆★☆ブラックジャックへようこそ！☆★☆☆★☆")
    println("ゲームを開始します")

    // デッキ初期化
    var deck = Deck()

    // プレイヤー・ディーラー初期化
    var player = User()
    var dealer = User()

    player.score += deck.draw(Role.PLAYER).number
    player.score += deck.draw(Role.PLAYER).number

    dealer.score += deck.draw(Role.DEALER).number
    // 2枚目は何を引いたか表示させない
    dealer.score += deck.draw(Role.DEALER,true).number

    println("あなたの現在の得点は%sです。".format(player.score))


//    while (true) {
//        try {
//            println("あなたの引いたカードは%sです。".format(deck.draw()))
//            println("ディーラーの引いたカードは%sです。".format(deck.draw()))
//        } catch (e: DeckOutException) {
//            println(e.message)
//            System.exit(0);
//        }
//    }

    println("ブラックジャック終了！また遊んでね★")
}
