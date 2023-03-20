package pt.ulusofona.cm.kotlin.challange.models

import pt.ulusofona.cm.kotlin.challange.exceptions.AlterarPosicaoException

class Posicao(var x:Int,var y:Int) {
    fun alterarPosicaoPara(x: Int, y: Int) {
        if(this.x == x && this.y == y){
            throw AlterarPosicaoException("Não é possivel andar no mesmo sitio")
        }else{
            this.x = x
            this.y = y
        }
    }

    override fun toString(): String {
        return "Posicao | x:$x | y:$y"
    }


}
