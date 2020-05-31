package game.myapp
import java.util.Scanner
import kotlin.random.Random

class Play_game (){
    val choices = mapOf(1 to "Rock", 2 to "Paper", 3 to "Scissor")
    var computer_choice = 0
    var user_wins: Int = 0
    var computer_wins: Int = 0
    val reader = Scanner(System.`in`)
    var user_choice = 0
    fun computer_selects () {
        var num: Int
        computer_choice = (1..3).random()
        println("computer chooses ${choices[computer_choice]}")
    }
    fun user_selects (){
        println(choices)
        print("Enter choice number: ")
        user_choice = reader.nextInt()
        println("user chooses ${choices[user_choice]}")
    }
    fun play (){
        if (user_choice == computer_choice){
            println("Draw")
        } else if (user_choice == 1 && computer_choice == 3){
            println("Player wins")
            user_wins += 1
        } else if (user_choice == 2 && computer_choice == 1){
            println("Player wins")
            user_wins += 1
        } else if (user_choice == 3 && computer_choice == 2){
            println("Player wins")
            user_wins += 1
        } else{
            println("Computer wins")
            computer_wins += 1
        }
    }
}