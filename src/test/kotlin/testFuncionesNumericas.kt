import org.junit.Test
import org.junit.jupiter.api.Assertions.assertAll
import kotlin.test.assertContains
import kotlin.test.assertTrue

class testFuncionesNumericas {

    val listaEnteros = listOf<Int>(1,2,3,4,5,6)
    var funcionesNumericas = FuncionesNumericas(listaEnteros)

    @Test
    fun paqueton(){
        assertAll(
            { assertTrue (funcionesNumericas.sumar() > 50 ,"No es más que 50" ) },
            {assertTrue (funcionesNumericas.sumar() != null ,"Es nulo" )},
            {assertContains(funcionesNumericas.listaEnteros,10,"No es 10")},
            { kotlin.test.assertTrue(funcionesNumericas.sumar() == 5, "No es igual a 5") }
        )
    }

}