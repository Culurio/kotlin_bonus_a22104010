package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Carro
import pt.ulusofona.cm.kotlin.challenge.models.Motor
import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.time.LocalDate

fun main(){
    var pessoa:Pessoa = Pessoa("Cláudio", LocalDate.of(2002,9,11))
    var carro: Carro = Carro("sdasd", Motor(12,12))

    pessoa.comprarVeiculo(carro)
    pessoa.moverVeiculoPara("sdasd", 1,1)
    println(pessoa)
    println(carro)
}