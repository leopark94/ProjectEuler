

fun main(){

    for (i in 1..333){
        for (j in i..1000){
            for(k in j .. 1000){

                if (i*i + j*j == k*k && i+j+k == 1000)
                    println(i*j*k)
            }
        }
    }
}