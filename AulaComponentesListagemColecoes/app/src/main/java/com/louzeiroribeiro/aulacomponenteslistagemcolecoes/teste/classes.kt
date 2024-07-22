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


// getter e setters

class Usuario() {

    var nome: String = ""
        get() {
            println("get: $field")
            return field.uppercase()
        }
        set(value) {
            field = "set: $value"
        }

    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18


}


fun main() {

    val usuario = Usuario()
    usuario.nome = "Pedro"
    usuario.idade = 21

    println("Nome: ${usuario.nome} - Idade: ${usuario.idade} - Tem maioridade? ${usuario.maiorIdade}")

    /*
        val pessoa = Pessoa()
        pessoa.nome = "Bruno"

        println("Nome:  ${pessoa.nome}")

    */


    /*
        /// Desestruturação

        val pergunta1 = Pergunta ("Qual a pergunta?", 1)
        val pergunta2 = Pergunta ("Qual a pergunta?", 2)

        val (pergunta, resposta ) = pergunta1

        println(pergunta)
        println(resposta)
    */


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