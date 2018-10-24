package ir

import java.util.*

object Farm {
    const val TOTAL_SLOTS = 1000000
    var Slots = ArrayList<Slot>()
    var Beings = ArrayList<BeingAbstract>()
    var BeingsTmp = ArrayList<BeingAbstract>()
    fun InitFarm() {
        for (i in 0..TOTAL_SLOTS) {
            var slot = Slot()
            slot.Being = 0
            slot.ID = i
            Slots.add(slot)
        }
    }

    fun AddBeing(being:BeingAbstract){
        val slot = Utils.GetEmptySlot()
        Slots[slot].Being = being.ID
        being.Position = slot
        Beings.add(being)
    }

}