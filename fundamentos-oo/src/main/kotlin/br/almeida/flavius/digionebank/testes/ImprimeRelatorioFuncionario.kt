package br.almeida.flavius.digionebank.testes

import br.almeida.flavius.digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    // Metedo estatico que permite chamadas via clase ao inves de via instancia
    companion object {
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}