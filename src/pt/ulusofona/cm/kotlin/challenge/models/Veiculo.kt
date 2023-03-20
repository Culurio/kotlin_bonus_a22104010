package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.util.*

abstract class Veiculo(val identificador:String):Movimentavel {
    var posicao:Posicao = Posicao(0,0)
    val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.UK)
    lateinit var dataDeAquisicao: Date

    abstract fun requerCarta():Boolean

}