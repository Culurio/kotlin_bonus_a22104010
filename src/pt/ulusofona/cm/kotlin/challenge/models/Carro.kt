package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(identificador: String,  val motor:Motor) : Veiculo(identificador),Ligavel {
    override fun requerCarta(): Boolean {
        return true
    }

    override fun ligar() {
        if(motor.ligado){
            throw VeiculoLigadoException("O veiculo já está ligado")
        }
        motor.ligado = true
    }

    override fun desligar() {
        if(!motor.ligado){
            throw VeiculoDesligadoException("O motor já está desligado")
        }
        motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun moverPara(x: Int, y: Int) {
        ligar()
        posicao.alterarPosicaoPara(x,y)
        desligar()
    }

    override fun toString(): String {
        return "Carro | $identificador | ${dateFormat.format(dataDeAquisicao)} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}