package com.louzeiroribeiro.aulacomponenteslistagemcolecoes.teste

/*
class Motorista (val nome: String) {
    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao(val nomeCaminhao: String ){
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao - motorista: $nome")
    }
}
*/

data class Pergunta(val pergunta: String, val respostaCerta: Int) {


}


fun main (){

    val pergunta1 = Pergunta ("Qual a pergunta?", 1)
    val pergunta2 = Pergunta ("Qual a pergunta?", 2)

    println( pergunta1 == pergunta2 )



/*
    val motorista = Motorista("Bruno")
    val caminhao = motorista.Caminhao("FH 6000")
    caminhao.exibirDadosCaminhao()
*/



/*
    val caminhao = Motorista.Caminhao("FH 600")
*/

/*
    val motorista = Motorista("Bruno")
    motorista.exibirDadosMotorista()
*/

}