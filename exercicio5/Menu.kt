package exercicio5

import kotlin.system.exitProcess

class Menu {
    private var escolhaMenuInicial: String = ""
        set(escolhaMenuInicial) {
            if (
                escolhaMenuInicial != "C" && escolhaMenuInicial != "c"
                && escolhaMenuInicial != "P" && escolhaMenuInicial!= "p"
                && escolhaMenuInicial != "S" && escolhaMenuInicial != "s"){
            println("Escolha inválida. Tente novamente")
            menuInicial()
            } else {
                field = escolhaMenuInicial
        }
    }

    private var escolhaMiniMenu : String = ""
        set(escolhaMiniMenu){
            if (escolhaMiniMenu == "1" || escolhaMiniMenu == "2"){
                field = escolhaMiniMenu
            } else {
                println("Escolha inválida. Tente novamente")
                miniMenu()
            }
        }

    fun menuInicial(): String {
        println("--------------------------------------------")
        println("Bem vindo ao calculo de tributos.")
        println("Qual tipo de conta/serviço deseja verificar?")
        println("--------------------------------------------")
        println("[C] Conta Corrente")
        println("[P] Conta Poupança")
        println("[S] Seguro de Vida")
        println("--------------------------------------------")
        escolhaMenuInicial = readln()

        return escolhaMenuInicial
    }

    fun miniMenu() {
        println("--------------------------------------------")
        println("O que deseja fazer agora?")
        println("--------------------------------------------")
        println("[1] Calcular novo tributo")
        println("[2] Sair")
        println("--------------------------------------------")
        escolhaMiniMenu = readln()

        if (escolhaMiniMenu == "1"){
            main()
        } else {
            exitProcess(0)
        }
    }
}