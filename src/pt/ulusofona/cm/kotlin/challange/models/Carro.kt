package pt.ulusofona.cm.kotlin.challange.models

import pt.ulusofona.cm.kotlin.challange.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challange.interfaces.Movimentavel

class Carro(identificador: String, val motor:Motor) : Veiculo(identificador),Ligavel,Movimentavel {

    override fun requerCarta(): Boolean {
        return true
    }

    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        TODO("Not yet implemented")
    }

    override fun estaLigado(): Boolean {
        TODO("Not yet implemented")
    }

    override fun moverPara(x: Int, y: Int) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}