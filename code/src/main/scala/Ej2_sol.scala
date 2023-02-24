object Ej2Sol extends App {

  def penultimo[A](ls:List[A]): A = {
    ls(ls.length - 2)
  }

  println(penultimo(List("enero", "febrero", "marzo", "abril")))

  def penultimo2[A](ls:List[A]): A = {
    ls match {
      case h :: _ :: Nil => h
      case _ :: tail => penultimo2(tail)
      case _ => throw new NoSuchElementException 
    }
  }

    println(penultimo2(List("enero", "febrero", "marzo", "abril")))



 }