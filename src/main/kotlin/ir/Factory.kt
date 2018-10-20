package ir

object Factory {
    var ID = 0
    fun GetObject(type: String): BeingAbstract {
        when (type) {
            "ANT" -> {
                ID++
                val ant = Ant()
                ant.ID = ID
                ant.Type = "ANT"
                return ant
            }
        }
        return Ant()
    }
}