package exercicio1.formas

class Quadrado(
    private var ladoParametro : Float = 0.0F
) : Forma {
    override fun calcularArea(): Float {
        return ladoParametro * ladoParametro
    }
}