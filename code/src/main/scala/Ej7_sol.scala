object Ej7Sol extends App {

    def simplifica (ls: List[Integer]): List[Integer] = {
        ls match {
            case Nil  => Nil
            case a :: Nil  => ls
            case a :: b :: tail if a == b => simplifica(b::tail)
            case a :: tail => a :: simplifica(tail)
            case _  => throw new NoSuchElementException
        }
    }

    println(simplifica(List (2, 2, 2, 3, 3, 2, 2, 4, 5, 5)))
  
}
