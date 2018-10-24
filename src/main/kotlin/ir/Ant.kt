package ir

class Ant : Animal, BeingAbstract() {

    override fun Step() {
        super.Step()
        Move()
        SearchForFood()
    }

    override fun Move() {
        Utils.Move(this)
    }

    fun SearchForFood(){
        var slot = this.Position
        for(i in ((slot-10)..(slot+10))){
            if (i>Farm.TOTAL_SLOTS) continue
            if(Farm.Beings[Farm.Slots[i].Being].Type == "FOOD"){
                this.Size++
                Farm.BeingsTmp.add(Farm.Beings[Farm.Slots[i].Being])
            }
        }
    }

    override fun Think() {
        // Can't
    }

    override fun Status() : String{
        return "Type :: $Type , ID :: $ID , Position :: $Position , Age :: $Age , Size :: $Size"
    }


}