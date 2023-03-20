package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(identificador: String,  val motor:Motor) : Veiculo(identificador),Ligavel {

    override fun requerCarta(): Boolean {
        return true
    }

    override fun ligar() {
        motor.ligado= true
    }

    override fun desligar() {
        motor.ligado=false
    }

    override fun estaLigado(): Boolean {
        return motor.ligado
    }

    override fun moverPara(x: Int, y: Int) {
        ligar()
        posicao.alterarPosicaoPara(x,y)
        desligar()
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}