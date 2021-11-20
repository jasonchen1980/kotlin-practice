package lessontree

data class Person(
    val name: String,
    val age: Int,
    val driverLicense: Boolean = false
)

val friendGroup = listOf(
    Person("Jo", 19),
    Person("Mic", 15),
    Person("Hay", 33, true),
    Person("Cal", 25)
)

//// true
//println(friendGroup.any { it.driverLicense })
//
//// false
//println(friendGroup.none { it.age < 18 })
//
//// true
//println(friendGroup.all { it.name.length < 4 })


//// below is Vacuous truth
//
//val nobody: List<Person> = emptyList<Person>()
//
//// false
//println(nobody.any { it.driverLicense })
//
//// true
//println(nobody.none {it.age < 18 })
//
//// true
//println(nobody.all { it.age < 18 })


//// collections
//
val objects: List<String> = listOf("cake", "rock", "car", "bool", "chicken")

//
//// [[cake, rock, car], [bool, chicken]]
//println(objects.chunked(3))
//
//// [[car, rock, cake], [chicken, bool]]
//println(objects.chunked(3) { it.reversed()})
//
//// [[cake, rock, car], [rock, car, bool], [car, bool, chicken]]
//println(objects.windowed(3))
//
//// [[cake, rock, car, bool], [car, bool, chicken], [chicken]]
//println(objects.windowed(4, 2, true))
//
//// [[bool, car, rock, cake], [chicken, bool, car], [chicken]]
//println(objects.windowed(4,2,true) {
//    it.reversed()
//})

// flatten

// [cake, rock, car, rock, car, bool, car, bool, chicken]
//println(objects.windowed(3).flatten())

// [L, o, u, M, e, i, C, y, n]
//val name: List<Char> = listOf("Lou", "Mei", "Cyn").flatMap {
//    it.toList()
//}
//println(name)

//val germanCities: List<String> = listOf(
//    "Aachen",
//    "Bielefeld",
//    "Munchen"
//)
//
//val germanLicensePlates: List<String> = listOf(
//    "AC",
//    "BI",
//    "M"
//)
//// [(Aachen, AC), (Bielefeld, BI), (Munchen, M)]
//println(germanCities.zip(germanLicensePlates))
//println(germanCities zip germanLicensePlates)
//
////[(AACHEN, ac), (BIELEFELD, bi), (MUNCHEN, m)]
//val citesToPlates: List<Pair<String, String>> = germanCities.zip(germanLicensePlates) { city, plats ->
//    city.uppercase() to plats.lowercase()
//}
//println(citesToPlates)
//val (cities: List<String>, plates: List<String>) = citesToPlates.unzip()
//println("$cities, $plates")

//val random: List<Int> = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 4)
//
//println(random.zipWithNext())
//
//println(random.zipWithNext { a, b -> b - a })
//
//println(random.sum())
//
//println(random.average())
//
//val reduceValue: Int = random.reduce { acc, value ->
//    acc * value
//}
//
//println(reduceValue)

val fruits: List<String> = listOf("apple", "cherry", "banana", "orange")

// 1080
fruits.fold(1) { acc, value ->
    acc * value.length
}

// [1, 5, 30, 180, 1080]
fruits.runningFold(1) { acc: Int, value: String ->
    acc * value.length
}