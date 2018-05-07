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

    player.hand.add(deck.draw(Role.PLAYER))
    player.hand.add(deck.draw(Role.PLAYER))

    dealer.hand.add(deck.draw(Role.DEALER))
    // 2枚目は何を引いたか表示させない
    dealer.hand.add(deck.draw(Role.DEALER,true))

    println("あなたの現在の得点は%sです。".format(player.getScore()))

    println(player.isBurst())

//    val read = readLine()

//    println(read)

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
