package blackjack

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

    println("あなたの現在の得点は${player.getScore()}です。")

    var input: String?

    // ユーザーのターン
    while (true) {
        println("カードを引きますか？引く場合はYを、引かない場合はNを入力して下さい")
        input = readLine()

        if("Y" == input || "y" == input) {
            player.hand.add(deck.draw(Role.PLAYER))

            println("あなたの現在の得点は${player.getScore()}です。")

            if(player.isBurst()) {
                println("バーストしました。")
                println("あなたの負けです。")
                println("ブラックジャック終了！また遊んでね★")
                System.exit(0)
            }

        } else if("N" == input || "n" == input) {
            break
        } else {
            println("YかNを入力して下さい。")
        }
    }

    // ディーラーのターン
    println("ディーラーの2枚目のカードは${dealer.hand[1]}でした。")
    println("ディーラーの現在の得点は${dealer.getScore()}です。")

    // 得点が17点以上になるまで繰り返す
    while(dealer.getScore() < 17) {
        dealer.hand.add(deck.draw(Role.DEALER))
    }

    println("あなたの得点は${player.getScore()}です。")
    println("ディーラーの得点は${dealer.getScore()}です。")

    if(dealer.isBurst()
            || player.getScore() > dealer.getScore()) {
        println("あなたの勝ちです。")
    } else if (player.getScore() == dealer.getScore()){
        println("引き分けです。")
    } else {
        println("あなたの負けです。")
    }

    println("ブラックジャック終了！また遊んでね★")
}
