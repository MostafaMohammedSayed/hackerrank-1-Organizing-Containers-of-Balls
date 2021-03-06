import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'organizingContainers' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts 2D_INTEGER_ARRAY container as parameter.
 */

fun organizingContainers(container: Array<Array<Int>>): String {
    // Write your code here
    val firstGroup = container[0]
    var type1InFirstGroup = firstGroup[0]
    var type2InFirstGroup = firstGroup[1]

    val secondGroup = container[1]
    var type1InSecondGroup = secondGroup[0]
    var type2InSecondGroup = secondGroup[1]
    while (type1InSecondGroup!=0){
        type1InFirstGroup++
        type1InSecondGroup--
        type2InFirstGroup--
        type2InSecondGroup++
        }
    return if (type2InFirstGroup == 0 && type1InSecondGroup == 0) {
        "Possible"
    } else {
        "Impossible"
    }

}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toInt()

        val container = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

        for (i in 0 until n) {
            container[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = organizingContainers(container)

        println(result)
    }
}
