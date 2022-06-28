//Паттерн скрывает сложную логику классов приводя все вызовы к одному объекту
//Помещает вызов нескольких сложных объектов в один объект
//У меня тут созданы функции startCar() и stopCar(), которые максимально простые, но используют в себе
//более сложные классы. Эти функции объединяют то, что нужно сделать для запуска или остановки автомобиля.

fun main() {

    val carFacade = CarFacade()

    carFacade.startCar()
    carFacade.stopCar()

}

interface Car {
    fun start()
    fun stop()
}

class Key: Car {
    override fun start() {
        println("Вставить ключи")
    }
    override fun stop() {
        println("Выдернуть ключи")
    }
}

class Handbrake: Car {
    override fun start() {
        println("Опустить ручник ключи")
    }

    override fun stop() {
        println("Поднять ручник")
    }
}

class Engine: Car {
    override fun start() {
        println("Завести двигатель")
    }

    override fun stop() {
        println("Остановить двигатель")
    }
}

class CarFacade {

    private val key = Key()
    private val engine = Engine()
    private val handbrake = Handbrake()

    fun startCar() {
        key.start()
        engine.start()
        handbrake.start()
        println()
    }

    fun stopCar() {
        key.stop()
        engine.stop()
        handbrake.stop()
    }

}