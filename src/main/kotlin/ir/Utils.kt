package ir

import java.util.*

object Utils {
    fun GetEmptySlot():Int{
        var slot:Slot
        do {
            slot = Farm.Slots[(0..1000000).random()]
        } while(!slot.IsEmpty)
        return slot.ID
    }
}