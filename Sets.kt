/*
* Sets - collection that does not have a specific order and does not allow duplicate values.
*
*  A set uses hash codes as array indices
*
* Searching for a specific element in a set is fast—compared with lists—especially for large collections.
*
* Sets tend to use more memory than lists for the same amount of data,
*  since more array indices are often needed than the data in the set.
*
* */

fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.contains("Pluto"))
    solarSystem.remove("Pluto")

}
