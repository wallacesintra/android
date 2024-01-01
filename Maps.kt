/*
* Maps - collection consisting of keys and values, key-value pair
*
*A map's keys are unique. A map's values, however, are not.
*
* */

fun main(){
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    solarSystem["Pluto"] = 5
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))
    solarSystem.remove("Pluto")

}


