
import kotlin.concurrent.fixedRateTimer
import kotlin.math.pow

//
//fun Int.isPrime(): Boolean{
//    var i = 2
//    while (i*i<=this){
//        if (this % i++ == 0) return false
//    }
//    return true
//}


fun main(){

    var result = 1

    val a = 2..20
    val primeNumber = a.filter { it.isPrime() }

//    primeNumber.flatMap{it ->
//        var p2: Int = it
//        while(p2 < 20) {
//            p2 = it * p2
//        }
//        p2
//    }
    for (p in primeNumber){
        var p2: Int = p
        while(p2*p<20){
            p2 *= p
        }
        result *= p2
    }
    println(result)
}