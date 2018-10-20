package ir

class Ant : Animal , BeingAbstract() , Runnable{
    override fun run() {
        while (true) {
            println("ANT :: $ID :: POSITION :: $Position")
            Thread.sleep(2000)
        }
    }

    override fun Move() {

    }

    override fun Think() {

    }

}