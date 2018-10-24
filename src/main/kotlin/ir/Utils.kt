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

    fun Move(being:BeingAbstract){
        Farm.Slots[being.Position].Being = 0
        Farm.Slots[being.Position].IsEmpty = true
        var slot = GetEmptySlot()
        Farm.Slots[slot].IsEmpty = false
        Farm.Slots[slot].Being = being.ID
        being.Position = slot
    }
}