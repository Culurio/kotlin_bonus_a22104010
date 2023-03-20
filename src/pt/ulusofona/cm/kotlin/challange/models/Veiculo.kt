package pt.ulusofona.cm.kotlin.challange.models

import pt.ulusofona.cm.kotlin.challange.interfaces.Movimentavel
import java.time.LocalDate
import java.util.*

abstract class Veiculo(val identificador:String):Movimentavel {
    var posicao:Posicao = Posicao(0,0)
    lateinit var dataDeAquisicao: LocalDate

    abstract fun requerCarta():Boolean

}