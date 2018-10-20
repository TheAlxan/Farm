package ir

abstract class BeingAbstract {
    var ID = 0
    var Position = 0
    var Type = "Unknown"
    var Age = 0
    open fun Status() : String{
        return "Type :: $Type , ID :: $ID , Position :: $Position , Age :: $Age"
    }

    open fun Step(){
        Age++
    }

}
