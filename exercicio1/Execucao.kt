package exercicio1

import exercicio1.Menu.Menu.miniMenu
import exercicio1.formas.*

class Execucao {
    private lateinit var objetoForma: Forma

    fun escolhaForma(){
        println("--------------------------------------")
        println("Qual a forma desejada?")
        println("[C] Círculo")
        println("[Q] Quadrado")
        println("[R] Retângulo")
        println("[T] Triângulo")
        println("--------------------------------------")
        val escolha = readln()

        println("--------------------------------------")
        when(escolha){
            "C", "c" -> {
                val raio = pedirAtributos("Insira o valor do raio do círculo: ")
                objetoForma = Circulo(raioParametro = raio)
                mostrarResultado("Círculo", objetoForma.calcularArea())
            }
            "R", "r" -> {
                val lado = pedirAtributos("Insira o valor do lado do retângulo: ")
                println("--------------------------------------")
                val altura = pedirAtributos("Insira o valor da altura do retângulo: ")
                objetoForma = Retangulo(ladoParametro = lado, alturaParametro = altura)
                mostrarResultado("Retângulo", objetoForma.calcularArea())
            }
            "Q", "q" -> {
                val lado = pedirAtributos("Insira o valor do lado do quadrado: ")
                objetoForma = Quadrado(ladoParametro = lado)
                mostrarResultado("Quadrado", objetoForma.calcularArea())
            }
            "T", "t" -> {
                val lado = pedirAtributos("Insira o valor do lado do triângulo: ")
                println("--------------------------------------")
                val altura = pedirAtributos("Insira o valor da altura do retângulo: ")
                objetoForma = Triangulo(ladoParametro = lado, alturaParametro = altura)
                mostrarResultado("Triângulo", objetoForma.calcularArea())
            }
            else -> {
                println("Ei, escolha inválida. Tente novamente")
                escolhaForma()
            }
        }
        println("--------------------------------------")

        miniMenu()
    }

    private fun pedirAtributos(texto : String): Float {
        print(texto)
        return readln().toFloat()
    }

    private fun mostrarResultado(forma : String, area : Float){
        println("--------------------------------------")
        println("Forma: $forma")
        println("Area: $area")
        println("--------------------------------------")
    }
}