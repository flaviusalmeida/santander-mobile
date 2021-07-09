package br.almeida.flavius.digionebank.testes

import br.almeida.flavius.digionebank.Gerente

fun main() {
    val amanda = Gerente("Amanda", "123.456.789-00", 4000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(amanda)

    TesteAutenticacao().autentica(amanda)
}