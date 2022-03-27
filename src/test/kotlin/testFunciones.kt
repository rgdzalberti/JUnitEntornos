import java.util.*

class testFunciones {

    var testFuncionesNumericas = testFuncionesNumericas()

    fun test4(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.noEsIgualA5()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }
    fun test3(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.sumaNoEsNulo()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }

    fun test2(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.numeroIguala10()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }
    fun test1(){
        println(Calendar.getInstance().time)
        println("Comienza test")
        testFuncionesNumericas.noEsIgualA5()
        println("Finaliza test")
        println(Calendar.getInstance().time)
    }


}