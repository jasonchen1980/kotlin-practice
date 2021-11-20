package lesson

import kotlin.test.Test
import kotlin.test.assertEquals

class BmiTest {

    @Test
    fun BmiCaculateTest() {
        val exceptBmi = 20.76
        val actualBmi = Bmi().Caculate(170.0, 60.0)
        assertEquals(exceptBmi, actualBmi)
    }

    @Test
    fun BmiCaculateMultiTest() {
        val Bmis = Bmipair(
            height = 170.0,
            weights = listOf<Double>(60.0, 71.0, 66.2)
        )
        val actualBmi = listOf<Double>(20.76, 24.57, 22.91)
        val exceptBmi = Bmi().CaculateMulti(Bmis)
        assertEquals(exceptBmi, actualBmi)
    }
}