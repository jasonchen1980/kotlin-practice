package lessontwo

class lensPractice {
}

object Constant {
    const val Constant2 = "object constant"
}
val foo = Constant.Constant2


// extension

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

    val volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        println("Volume: $volume l")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }
}

fun buildAquarium() {
    // everything custom
    val aquarium = Aquarium(width = 25, height = 35, length = 110)
    aquarium.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")
}

fun main() {

    buildAquarium()
    // println("constant = ${foo}")

//    val plant = GreenLeafyPlant(size = 10)
//    plant.print()
//    println("\n")
//    val aquariumPlant: AquariumPlant = plant
//    aquariumPlant.print()  // what will it print?

//    val aquariumPlant.isGreen : Boolean
//        get() =

//    val equipment = "fish net" to "catching fish"
//    val (tool, use) = equipment
//    println("$tool is used for $use")

}