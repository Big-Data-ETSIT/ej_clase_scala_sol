object Ej3Sol extends App {

  def eliminaElemento[Int](e:Int , ls:List[Int]): List[Int] = {
    ls.filter(el => el != e)
  }

  println(eliminaElemento(2, List(1,1,2,3,2)))
  

  def eliminaElemento2[Int](e:Int, ls:List[Int]): List[Int] = {
    ls match {
      case Nil => Nil
      case h :: tail if(h==e) => eliminaElemento2(e, tail)
      case h :: tail => h :: eliminaElemento2(e, tail)
      case _ => throw new NoSuchElementException 
    }
  }

  println(eliminaElemento2(2, List(1,1,2,3,2)))
  
 }