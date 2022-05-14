package exercicio5

class ContaPoupanca : Tributo {
    override fun calcularTributos(): Double {
        println("Conta Poupança não possui tributo")
        return 0.0
    }
}