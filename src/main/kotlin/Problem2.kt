



fun fibo(i:Int):Int {
 return if (i<2) 1 else fibo(i-1) + fibo(i-2)
}



fun main (){
 var sum:Int = 0
 for (i in 1 until 1000){
  if (fibo(i) > 4000000) break
  if (fibo(i) % 2 == 0)
  {sum += fibo(i)}
 }
 print(sum)

}