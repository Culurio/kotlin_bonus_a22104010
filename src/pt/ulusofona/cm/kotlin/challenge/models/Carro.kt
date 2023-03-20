package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(identificador: String, private val motor:Motor) : Veiculo(identificador),Ligavel {

    override fun requerCarta(): Boolean {
        return true
    }

    override fun ligar() {
        motor.ligarMotor()
    }

    override fun desligar() {
        motor.desligarMotor()
    }

    override fun estaLigado(): Boolean {
        return motor.getLigado()
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