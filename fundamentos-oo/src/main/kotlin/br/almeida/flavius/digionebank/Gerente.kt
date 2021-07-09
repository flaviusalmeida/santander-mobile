package br.almeida.flavius.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {

    override fun calculoAuxilio() = salario * 0.1
    override fun login(): Boolean = "senha123" == senha
}