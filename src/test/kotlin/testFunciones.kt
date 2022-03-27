import org.junit.Test
import java.util.*

class testFunciones {

    var testFuncionesNumericas = testFuncionesNumericas()

    @Test
    fun test4(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.noEsIgualA5()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    @Test
    fun test3(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.sumaNoEsNulo()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    @Test
    fun test2(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.numeroIguala10()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    @Test
    fun test1(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.noEsIgualA5()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }


}