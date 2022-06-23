




fun main() {

    var max = 0
    var maxN = 0

    for (n in 1000000 downTo 1){
        var c = 0

        var v = n.toLong()

        while(v != 1L){

            c ++
            if (v % 2 == 0L)
                v = v/2
            else
                v = v * 3 + 1

//            println(v)

        }

        if (c > max) {
            println("$n: $max")
            max = c
            maxN = n
        }

    }

    print(maxN)
}


