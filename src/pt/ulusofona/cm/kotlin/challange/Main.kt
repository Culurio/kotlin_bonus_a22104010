package pt.ulusofona.cm.kotlin.challange

import pt.ulusofona.cm.kotlin.challange.models.Carro
import pt.ulusofona.cm.kotlin.challange.models.Motor
import pt.ulusofona.cm.kotlin.challange.models.Pessoa
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(){
    var pessoa:Pessoa = Pessoa("Cláudio", LocalDate.of(2002,9,11))
    var carro: Carro = Carro("sdasd", Motor(12,12))

    pessoa.comprarVeiculo(carro)
    pessoa.moverVeiculoPara("sdasd", 1,1)
    println(pessoa)
    println(carro)
}