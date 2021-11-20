package lesson

data class Bmipair(
    val height: Double,
    val weights: List<Double>
)

class Bmi {

    fun Caculate(height: Double, weight: Double): Double {
        val heightsquare = (height / 100) * (height / 100)
        val bmi = weight / heightsquare
        return "%.2f".format(bmi).toDouble()
    }

    fun CaculateMulti(Bmis: Bmipair): List<Double> {
        val bmis = mutableListOf<Double>()
        /*for (weight in Bmis.weights) {
            val bmi = Caculate(Bmis.height, weight)
            bmis.add(bmi)
        }*/
        val height = Bmis.height
        Bmis.weights.forEach {
            bmis.add(Caculate(height, it))
        }
        return bmis
    }
}

fun main() {
    val bmi = Bmi()
    println(bmi.Caculate(170.0, 60.0))

    val Bmis = Bmipair(
        height = 170.0,
        weights = listOf<Double>(60.0, 71.0, 66.2)
    )
    println(bmi.CaculateMulti(Bmis))
}