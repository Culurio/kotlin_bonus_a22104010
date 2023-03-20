package pt.ulusofona.cm.kotlin.challange.models

import pt.ulusofona.cm.kotlin.challange.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challange.interfaces.Movimentavel

class Bicicleta(identificador:String): Veiculo(identificador) {
    override fun requerCarta(): Boolean {
        return false
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x,y)
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | ${dataDeAquisicao} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}