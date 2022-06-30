class Smartphone(private val good: Good): Good {

    override fun sum() = good.sum() + PRICE
    override fun receipt() = good.receipt() + "\nSmartphone...$PRICE"

    companion object {
        private const val PRICE = 500
    }
}