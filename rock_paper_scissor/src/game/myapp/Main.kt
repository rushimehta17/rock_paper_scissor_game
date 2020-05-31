package game.myapp

import kotlin.math.max

fun playgame() {
    val game = Play_game()
    do {
        game.user_selects()
        game.computer_selects()
        game.play()
    }while (game.user_wins < 5 && game.computer_wins < 5)
    if (game.user_wins == 5){
        println("Player wins the game!")
    } else{
        println("Computer wins the game!")
    }
}

fun main(args: Array<String>){
    println("Win 5 matches to win the game")
    playgame()
}