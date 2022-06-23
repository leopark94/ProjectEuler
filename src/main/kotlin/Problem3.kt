

fun main(){
    var target:Long = 600851475143
    for (i in 2 .. target){

        while (target % i == 0.toLong()){
            println(i)
            target = target / i
            println(target)

        }
        if (i == target) break
//        println(i)
    }
}