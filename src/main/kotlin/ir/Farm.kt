package ir

import java.util.*

object Farm {
    var Slots = ArrayList<Slot>()
    fun InitFarm() {
        for (i in 0..1000000) {
            var slot = Slot()
            slot.Being = 0
            slot.ID = i
            Slots.add(slot)
        }
    }

}