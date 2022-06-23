import kotlin.math.absoluteValue

fun Int.pow(y:Int):Int{
    var result = 1
    repeat(y) {
        result *= this
    }
    return result
}

fun main(){
    val range = 1..100
    var sum1 = 0
    var sum2 = range.sum().pow(2)
    range.forEach{
        sum1 += it.pow(2)
    }

    println((sum1-sum2).absoluteValue)
}
