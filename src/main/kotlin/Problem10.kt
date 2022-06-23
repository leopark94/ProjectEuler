


fun main(){
    var c = 0L

    val l = (2..2000000).filter{it.isPrime()}.forEach {
        c = c + it.toLong()
    }

    println(c)
}
