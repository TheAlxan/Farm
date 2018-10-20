package ir

import java.util.*
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    Farm.InitFarm()
    for (i in 0..100){
        Farm.AddBeing(Factory.GetObject("ANT"))
    }

    thread {
        while (true) {
            Farm.Beings.forEach {
                it.Step()
            }
            Thread.sleep(200)
        }
    }

    val sc = Scanner(System.`in`)
    doloop@ do {
        print("~::")
        val cmd = sc.nextLine()
        when(cmd){
            "exit" -> break@doloop
            "farmstat" -> {
                for(i in 0..(Farm.Beings.size-1)){
                    println(Farm.Beings[i].Status())
                }
            }
            "start" -> {

            }
        }
    } while(true)
}