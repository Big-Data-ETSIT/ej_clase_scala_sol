object Ej4Sol extends App {

    def cuadrado(ls: List[Int]): List[Int] = {
        ls.map(el => el * el)
    }
    
    println(cuadrado(List(1,1,2,3,2)))

    def cuadrado2(ls: List[Int]): List[Int] = {
        ls match {
            case Nil => Nil
            case h :: tail => (h*h) :: cuadrado2(tail)
            case _ => throw new NoSuchElementException
        }
    }
    
    println(cuadrado2(List(1,1,2,3,2)))

 }