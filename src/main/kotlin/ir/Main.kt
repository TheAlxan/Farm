package ir

import java.util.*
import kotlin.concurrent.thread

fun beings(){
    for(i in 0..(Farm.Beings.size-1)){
        if(Farm.Beings[i].Type != "FOOD")
        println(Farm.Beings[i].Status())
    }
}

fun count(){
    var map = HashMap<String,Int>()
    for(i in 0..(Farm.Beings.size-1)){
        if(map.containsKey(Farm.Beings[i].Type))
            map[Farm.Beings[i].Type] = map[Farm.Beings[i].Type]!!.plus(1)
        else
            map[Farm.Beings[i].Type] = 1
    }
    for(i in map){
        println("${i.key} :: ${i.value}")
    }
}

fun main(args: Array<String>) {
    Farm.InitFarm()
    for (i in 0..100){
        Farm.AddBeing(Factory.GetObject("ANT"))
    }

    for (i in 0..100000){
        Farm.AddBeing(Factory.GetObject("FOOD"))
    }

    thread {
        while (true) {
            Farm.Beings.forEach {
                it.Step()
            }
            Farm.Beings.removeAll(Farm.BeingsTmp)
            Farm.BeingsTmp = arrayListOf()
            Thread.sleep(200)
        }
    }

    val sc = Scanner(System.`in`)
    doloop@ do {
        print("~::")
        val cmd = sc.nextLine()
        when(cmd){
            "exit" -> break@doloop
            "beings" -> beings()
            "count" -> count()
        }
    } while(true)

}