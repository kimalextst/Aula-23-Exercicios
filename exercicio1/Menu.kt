package exercicio1

import kotlin.system.exitProcess

class Menu {
    companion object Menu {
        fun miniMenu() {
            val objetoExecucao = Execucao()

            println("--------------------------------------")
            println("O que deseja fazer?")
            println("[1] Calcular area de uma nova forma")
            println("[2] Sair")
            println("--------------------------------------")
            val escolha = readln()

            if (escolha == "1"){
                objetoExecucao.escolhaForma()
            } else if (escolha == "2"){
                exitProcess(0)
            } else {
                println("Escolha inválida. Tente novamente")
                miniMenu()
            }
        }
    }
}