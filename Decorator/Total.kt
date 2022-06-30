class Total(private val good: Good): Good {

    override fun sum() = good.sum()
    override fun receipt() = good.receipt() + "\nTotal....${sum()}"

}