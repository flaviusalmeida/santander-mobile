package br.almeida.flavius.digionebank.testes

import br.almeida.flavius.digionebank.Cliente
import br.almeida.flavius.digionebank.ClienteTipo


fun main() {
    val jose = Cliente("Flávio", "123.456.789-99", ClienteTipo.PF, "123456")

    println(jose)

    TesteAutenticacao().autentica(jose)
}