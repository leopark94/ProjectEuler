
fun Int.isPrime(): Boolean{
    var i = 2
    while (i*i <= this){
        if (this % i++ == 0) return false
    }
    return true
}

fun main(){
    var c = 0
    print(generateSequence (2){it+1}.filter {it.isPrime()}.take(10001).last())
}