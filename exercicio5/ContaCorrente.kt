package exercicio5

class ContaCorrente : Tributo {
    override fun calcularTributos(): Double {
        print("Insira o valor em sua conta/bens: R$")
        val valor =  readln().toDouble()
        println("--------------------------------------------")

        val resultado = valor * 0.01

        println("Sua Conta Corrente possui o tributo de R$$resultado")

        return resultado
    }

}