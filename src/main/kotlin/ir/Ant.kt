package ir

class Ant : Animal, BeingAbstract() {

    override fun Step() {
        super.Step()
        Move()
    }

    override fun Move() {

    }

    override fun Think() {
        // Can't
    }


}