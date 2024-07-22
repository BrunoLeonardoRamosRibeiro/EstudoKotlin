package com.louzeiroribeiro.aulacomponenteslistagemcolecoes.teste

class Motorista (val nome: String) {
    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao(val nomeCaminhao: String ){
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao - motorista: $nome")
    }
}
fun main (){

    val motorista = Motorista("Bruno")
    val caminhao = motorista.Caminhao("FH 6000")
    caminhao.exibirDadosCaminhao()



/*
    val caminhao = Motorista.Caminhao("FH 600")
*/

/*
    val motorista = Motorista("Bruno")
    motorista.exibirDadosMotorista()
*/

}