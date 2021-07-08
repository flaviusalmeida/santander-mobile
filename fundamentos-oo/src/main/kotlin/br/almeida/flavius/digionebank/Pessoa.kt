package br.almeida.flavius.digionebank

open class Pessoa(
    var nome: String,
    var cpf: String,
) {
    fun pessoaInfo() = "$nome e $cpf"
}