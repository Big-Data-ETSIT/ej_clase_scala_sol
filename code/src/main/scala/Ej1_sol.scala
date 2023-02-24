object Ej1Sol extends App {

  def nElemento[A](n:Int, ls:List[A]): A = {
    ls(n-1)
  }

  println(nElemento(1, List("enero", "febrero", "marzo", "abril")))

  def nElemento2[A](n:Int, ls:List[A]): A = {
    ls match{
      case h :: _ if(n==1)  => h
      case h :: tail => nElemento2(n-1, tail)
      case Nil => throw new NoSuchElementException 
    }
  }

    println(nElemento2(2, List("enero", "febrero", "marzo", "abril")))


  def nElemento3[A](n:Int, ls:List[A]): A = {
    (n, ls) match{
      case (1, h :: _) => h
      case (n, h :: tail) => nElemento2(n-1, tail)
      case (_, Nil) => throw new NoSuchElementException 
    }
  }
  println(nElemento3(4, List("enero", "febrero", "marzo", "abril")))
}