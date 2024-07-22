package com.louzeiroribeiro.aulacomponenteslistagemcolecoes.teste

class Matematica {
}

fun executar(){
    println("executar")
}

/*class Botao {
    fun configurarCliqueBotao( nome: String, funcao: () -> Unit ){
        funcao()
        println("Nome: $nome")
    }
}*/

class Botao {
    fun configurarCliqueBotao( funcao: (String) -> Unit ){
        funcao("Bruno")
    }
}

fun executarClique(){
    println("Executar clique do botão função comum")
}

fun main(){

    val botao = Botao()

    botao.configurarCliqueBotao{
        println("Executou função lambda $it")
    }
//    botao.configurarCliqueBotao {
//        println("Executu função lambda")
//    }

/*    // Função lambda
    var funcaoLambda = { nome: String, idade: Int ->
        println("Executar nome: $nome idade: $idade")
    }

    funcaoLambda("Bruno" , 47)*/




}