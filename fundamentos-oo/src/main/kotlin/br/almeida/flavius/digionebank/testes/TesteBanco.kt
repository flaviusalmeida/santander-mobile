package br.almeida.flavius.digionebank.testes

import br.almeida.flavius.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 11)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco 2")

    println(banco2.nome)
    println(banco2.numero)

    println(banco2.info())

}