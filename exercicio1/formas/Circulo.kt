package exercicio1.formas
const val PI = 3.14F

class Circulo (
    private var raioParametro : Float = 0.0F
) : Forma {
    override fun calcularArea(): Float {
        return PI * (raioParametro * raioParametro)
    }
}