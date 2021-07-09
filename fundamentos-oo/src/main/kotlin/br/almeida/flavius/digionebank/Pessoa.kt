package br.almeida.flavius.digionebank

abstract class Pessoa(
    val nome: String,
    val cpf: String,
) {
    fun pessoaInfo() = "$nome e $cpf"
}