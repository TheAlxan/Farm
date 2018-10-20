package ir

object Factory {
    var ID = 0
    fun GetObject(type:String) : Runnable {
        when (type) {
        "ANT" -> {
            ID++
            val ant = Ant()
            ant.ID = ID
            ant.Position = Utils.GetEmptySlot()
            return ant
        }
    }
        return Ant()
    }
}