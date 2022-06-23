import java.lang.Math.sqrt

fun numberOfDivisor(int:Int):Int{


    var cnt = 0
//    println(int)
    for(i in 1..int) {
        if (int % i == 0)
//            println(i)
            cnt++
    }

    return cnt



}

fun main(){

    var number = 0
    var i = 0
    while(number < 500){
        i++
        number = numberOfDivisor(i*(i+1)/2)
        println("$i:$number")
    }
    println(i)

}