class Macbook(private val good: Good): Good {

    override fun sum() = good.sum() + PRICE
    override fun receipt() = "Macbook....$PRICE"

    companion object {
        private const val PRICE = 1000
    }
}