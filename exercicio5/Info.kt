package exercicio5

class Info {
    private val objetoMenu = Menu()
    private lateinit var objetoTributo: Tributo

    fun mostrarTributo(){
        when (objetoMenu.menuInicial()){
            "C", "c" -> {
                objetoTributo = ContaCorrente()
                println("--------------------------------------------")
                objetoTributo.calcularTributos()
            }
            "P", "p" -> {
                objetoTributo = ContaPoupanca()
                println("--------------------------------------------")
                objetoTributo.calcularTributos()
            }
            "S", "s" -> {
                objetoTributo = SeguroDeVida()
                println("--------------------------------------------")
                objetoTributo.calcularTributos()
            }
        }
    }
}