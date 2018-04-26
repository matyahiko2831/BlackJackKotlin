package hello

import model.*

fun main(args: Array<String>) {
    println("☆★☆☆★☆ブラックジャックへようこそ！☆★☆☆★☆")
    println("ゲームを開始します")
//    Card card = new Card()
    println()
}

val hello: (String) -> String = {
    val words = mutableListOf<String>()

    words.add("Hello")
    words.add(when (it.length) {
        0 -> ""
        1 -> it.toUpperCase()
        else -> it[0].toUpperCase() + it.substring(1)
    }).toString()

    words.joinToString(separator = ", ").plus("!!")
}