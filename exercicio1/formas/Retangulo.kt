package exercicio1.formas

class Retangulo(
    private var ladoParametro : Float = 0.0F,
    private var alturaParametro : Float = 0.0F
) : Forma {
    override fun calcularArea(): Float {
        return ladoParametro * alturaParametro
    }
}