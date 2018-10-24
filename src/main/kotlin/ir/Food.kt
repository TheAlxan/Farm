package ir

class Food : BeingAbstract{
    var Energy = 0
    constructor(){
        this.Energy = (1..100).random()
    }

}