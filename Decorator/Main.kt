fun main() {

    var good: Good = Smartphone(Good.Empty())
    good = Macbook(good)
    good = Total(good)
    println(good.receipt())
}


