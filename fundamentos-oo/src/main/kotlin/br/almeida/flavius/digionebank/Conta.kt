package br.almeida.flavius.digionebank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {

    fun deposita(valor: BigDecimal){

    }
    fun saque(valor: BigDecimal){

    }
}