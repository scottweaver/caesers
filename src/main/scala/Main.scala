@main def hello(): Unit = {

 val result =  Range(1, 1000).foldLeft(0) {
    case (acc, i) if (i % 3) == 0 || (i % 5) == 0 => acc + i
    case (acc, _) => acc
  }

  println(result)

  println(fib(7))
}


def fib(i: Int): Int = {

   i match {
     case 1  => 1
     case 2  => 1
     case x => fib(x-1) + fib(x-2)
   }

}

