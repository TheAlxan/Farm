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

            "FOOD" -> {
                ID++
                val food = Food()
                food.ID = ID
                food.Type = "FOOD"
                return food
            }
        }
        return Ant()
    }
}