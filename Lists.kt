/*
* list - ordered, resizable collection
* List is an interface that defines properties and methods related to a read-only ordered collection of items.
*
* MutableList extends the List interface by defining methods to modify a list, such as adding and removing elements.
*
* accessing element:
*   index -> listName[index]
*   get() -> listName.get(index)


* indexOf() - getting an element by its index
  listName.indexOf(element)
the element doesn't occur in the list, it returns -1


*add() - add to a mutable list
* listName.add(element)
* listName.add(index, value)
*


* update list
* listName[index] = newValue
*
*

* remove from the list
*listName.removeAt(index)
* listName.remove(element)
*
* contains() -  returns a Boolean if an element exists in a list
* listName.contains(element)
*
* use in - check if an element is in a list, returns boolean
*
* "Element to check" in listName
* * */

fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    //Iterate over list elements using a for loop
    for (planet in solarSystem) {
        println(planet)
    }

    val solar = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println("Yotta" in solar)

    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(2))

}

