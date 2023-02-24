object Ej5Sol extends App{

    def esPalindromo(s: IndexedSeq[Char]): Boolean = {
        s match {
            case Seq() => true
            case Seq(a) => true
            case a +: w :+ b if (a == b) => esPalindromo(w)
            case a +: w if(esSimbolo(a)) => esPalindromo(w)
            case w :+ a if(esSimbolo(a)) => esPalindromo(w)
            case _ => false
        }
    }
    
    def esSimbolo(c: Char): Boolean = {
        !c.isLetter
    }


    println(esPalindromo(""))
    println(esPalindromo("p"))
    println(esPalindromo("pop"))
    println(esPalindromo("race car"))
    println(esPalindromo("a man, a plan, a canal, panama!"))
    println(esPalindromo("apple"))
    
  
}
