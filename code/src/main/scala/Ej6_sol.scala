object Ej6Sol extends App{
    def trim(s : IndexedSeq[Char]) : IndexedSeq[Char] = {
        s match {
        case Seq() => s
        case a +: w if esSimbolo(a) => trim(w)
        case w :+ a if esSimbolo(a) => trim(w)
        case _ => s
        }
    }

    def esSimbolo(c : Char) : Boolean = {
        ! c.isLetter
    }

    println(trim("ala"))
    println(trim("¿comida?"))
    println(trim("¡abeja"))
}
