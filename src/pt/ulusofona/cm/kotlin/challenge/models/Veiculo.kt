package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.LocalDate

abstract class Veiculo(val identificador:String):Movimentavel {
    var posicao:Posicao = Posicao(0,0)
    lateinit var dataDeAquisicao: LocalDate

    abstract fun requerCarta():Boolean

}