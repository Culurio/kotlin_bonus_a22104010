package pt.ulusofona.cm.kotlin.challange

import pt.ulusofona.cm.kotlin.challange.models.Pessoa
import java.time.LocalDate
import java.util.*

fun main(){
    var pessoa: Pessoa = Pessoa("Rita", LocalDate.of(2001,12,15))
    println(pessoa.temCarta())
    println(pessoa.tirarCarta())
    println(pessoa.temCarta())
}