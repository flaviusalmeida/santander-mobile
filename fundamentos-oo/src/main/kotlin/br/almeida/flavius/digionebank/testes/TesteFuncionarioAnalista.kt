package br.almeida.flavius.digionebank.testes

import br.almeida.flavius.digionebank.Analista

fun main() {
    val flavius = Analista("Flavius", "123.456.789-00", 2000.0)
    ImprimeRelatorioFuncionario.imprime(flavius)
}