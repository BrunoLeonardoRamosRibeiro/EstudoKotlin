package com.louzeiroribeiro.aprendendokotlindozero

class Carro {
    var cor = "Vermelho"

    fun acelerar()
    {
        // ***
    }
}
fun main() {

    var carro: Carro? = null

    carro = Carro()

   val cor = carro?.cor ?: "Cor padrão"

    println( cor )

}