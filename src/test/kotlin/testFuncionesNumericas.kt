import org.junit.Test

class testFuncionesNumericas {

    val listaEnteros = listOf<Int>(1,2,3,4,5,6)
    var funcionesNumericas = FuncionesNumericas(listaEnteros)

    @org.junit.Test
    fun esMayorQue50(): Boolean {
       return funcionesNumericas.sumar() > 50
    }

    @Test
    fun numeroIguala10(): Boolean {
        return listaEnteros.any {it == 10}
    }

    @Test
    fun sumaNoEsNulo(): Boolean {
        return funcionesNumericas.sumar() != null
    }

    @Test
    fun noEsIgualA5(): Boolean {
        return funcionesNumericas.numeroMenor() != 5
    }
}