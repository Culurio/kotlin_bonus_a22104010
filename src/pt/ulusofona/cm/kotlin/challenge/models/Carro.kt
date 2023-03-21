package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(identificador: String,  val motor:Motor) : Veiculo(identificador),Ligavel {
    override fun requerCarta(): Boolean {
        return true
    }

    override fun ligar() {
        motor.ligar()
    }

    override fun desligar() {
        motor.desligar()
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun moverPara(x: Int, y: Int) {
        motor.ligar()
        posicao.alterarPosicaoPara(x,y)
        motor.desligar()
    }

    override fun toString(): String {
        return "Carro | $identificador | ${dateFormat.format(dataDeAquisicao)} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}