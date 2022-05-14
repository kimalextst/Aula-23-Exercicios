package exercicio5

class SeguroDeVida : Tributo {
    override fun calcularTributos(): Double {
        println("Seguro de vida possui tributo fixo de R$42,00")
        return 42.0
    }
}