fun main() {

    val hamburger = Hamburger.Builder()
        .cheese(true)
        .tomatoes(false)
        .build()

    println(hamburger)
}

data class Hamburger(
    val cheese: Boolean,
    val tomatoes: Boolean,
    val meat: Boolean
) {
    class Builder {
        private var cheese: Boolean = true
        private var tomatoes: Boolean = true
        private var meat: Boolean = false

        fun cheese(value: Boolean) = apply { cheese = value }
        fun tomatoes(value: Boolean) = apply { tomatoes = value }
        fun meat(value: Boolean) = apply { meat = value }

        fun build() = Hamburger(cheese, tomatoes, meat)
    }
}