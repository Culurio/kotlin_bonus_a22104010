package pt.ulusofona.cm.kotlin.challange.models

import java.util.*

abstract class Veiculo(val identificador:String) {
    var posicao:Posicao = Posicao(0,0)
    val dataDeAquisicao: Date = Date()


    abstract fun requerCarta():Boolean

}