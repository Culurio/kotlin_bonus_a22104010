package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Carro
import pt.ulusofona.cm.kotlin.challenge.models.Motor
import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import java.util.*


fun main(){
    var pessoa:Pessoa = Pessoa("Cláudio", Date(2002-1900,8,11))
    var carro: Carro = Carro("sdasd", Motor(12,12))

    pessoa.comprarVeiculo(carro)
    pessoa.moverVeiculoPara("sdasd", 1,1)
    println(pessoa)
    println(carro)
    println(pessoa.tirarCarta())
    carro.ligarCarro()
    carro.ligarCarro()
}