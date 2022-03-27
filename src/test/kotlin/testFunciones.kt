import org.junit.Test
import org.junit.jupiter.api.Order
import java.util.*
import kotlin.test.assertContains
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assertions.*

class testFunciones {

    var testFuncionesNumericas = FuncionesNumericas(listOf(1,2,3,4,5,6))

    @Test
    @Order(4)
    fun test4(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        assertTrue (testFuncionesNumericas.sumar() > 50 ,"No es más que 50" )
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    @Test
    @Order(3)
    fun test3(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        assertTrue (testFuncionesNumericas.sumar() != null ,"Es nulo" )
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    @Test
    @Order(2)
    fun test2(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        assertContains(testFuncionesNumericas.listaEnteros,10,"No es 10")
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    @Test
    @Order(1)
    fun test1(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        assertTrue (testFuncionesNumericas.sumar() == 5 ,"No es igual a 5" )
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }


}