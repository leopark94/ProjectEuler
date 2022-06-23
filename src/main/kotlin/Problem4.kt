//import kotlin.math.pow
//

//fun Int.pow(x: Int) = toDouble().pow(x).toInt()

fun maxPalindrome(i:Int):Int {

    var result:Int = 0
    val max = 10.pow(i) - 1
    val min = 10.pow(i-1)

    for (i in max downTo min){
        for (j in max downTo min)
            if(palindromeCheck(i*j)) {
//                println("$i * $j")
                if (i*j>result) {
                    result = i*j}
            }
    }
    return result
}


fun palindromeCheck(i:Int):Boolean{

    val target = i.toString().toList()
    val size = target.size


    for (i in 0 until size){
        if (target[i] != target[size-i-1]){
            return false
        }

    }
    return true
}



fun main(){
    println(maxPalindrome(3))
}