package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(identificador: String,  val motor:Motor) : Veiculo(identificador) {
    override fun requerCarta(): Boolean {
        return true
    }

    fun ligarCarro() {
        motor.ligar()
    }

    fun desligarCarro() {
        motor.desligar()
    }

    fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun moverPara(x: Int, y: Int) {
        ligarCarro()
        posicao.alterarPosicaoPara(x,y)
        desligarCarro()
    }

    override fun toString(): String {
        return "Carro | $identificador | ${dateFormat.format(dataDeAquisicao)} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}