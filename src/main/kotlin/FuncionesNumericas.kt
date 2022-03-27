class FuncionesNumericas(listaEnteros: List<Int>){

    val listaEnteros = listaEnteros

    fun sumar(): Int {
        return listaEnteros.sum()
    }
    fun numeroMayor(): Int? {
        return listaEnteros.maxOrNull()
    }
    fun ordenar(): List<Int> {
        return listaEnteros.sorted()
    }
    fun numeroMenor(): Int? {
        return listaEnteros.minOrNull()
    }

}


fun main(){



}