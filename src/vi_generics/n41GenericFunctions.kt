package vi_generics

import util.TODO
import java.util.*

fun task41(): Nothing = TODO(
    """
        Task41.
        Add a 'partitionTo' function that splits a collection into two collections according to a predicate.
        Uncomment the commented invocations of 'partitionTo' below and make them compile.

        There is a 'partition()' function in the standard library that always returns two newly created lists.
        You should write a function that splits the collection into two collections given as arguments.
        The signature of the 'toCollection()' function from the standard library may help you.
    """,
        references = { l: List<Int> ->
            l.partition { it > 0 }
            l.toCollection(HashSet<Int>())
        }
)

fun List<String>.partitionWordsAndLines(): Pair<List<String>, List<String>> {
    var words= mutableListOf<String>()
    var Lines= mutableListOf<String>()
    var other=this
    for(i in other){
        if (i.contains(" "))
            Lines.add(i)
        else
            words.add(i)
    }
    return Pair(words,Lines)
}

fun Set<Char>.partitionLettersAndOtherSymbols(): Pair<Set<Char>, Set<Char>> {
    var character= mutableSetOf<Char>()
    var nonchar= mutableSetOf<Char>()
    var other=this
    for(i in other){
        if (i in 'a'..'z' || i in 'A'..'Z')
            character.add(i)
        else
            nonchar.add(i)
    }
    return Pair(character,nonchar)
   // return partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
}


