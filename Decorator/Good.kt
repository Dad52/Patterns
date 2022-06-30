interface Good {
    fun sum(): Int
    fun receipt(): String

    class Empty: Good {
        override fun sum() = 0
        override fun receipt() = "Receipt..."
    }
}