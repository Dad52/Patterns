fun main() {

    val inputStr = readLine().toString()

    Factory().getCurrentOS(inputStr = inputStr).launchOS()

}

interface OS {
    fun launchOS()
}

object Constants {
    const val WINDOWS = "windows"
    const val LINUX = "linux"
    const val MAC = "mac"
}

class Windows(): OS {
    override fun launchOS() {
        println("windows launched")
    }
}
class Linux(): OS {
    override fun launchOS() {
        println("linux launched")
    }
}
class Mac(): OS {
    override fun launchOS() {
        println("mac launched")
    }
}

class Factory {
    fun getCurrentOS(inputStr: String): OS {
        return when (inputStr.lowercase()) {
            Constants.WINDOWS -> Windows()
            Constants.LINUX -> Linux()
            Constants.MAC -> Mac()
            else -> throw IllegalArgumentException("OS was not found")
        }
    }
}