package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException

class Motor(val cavalos:Int, val cilindrada:Int) {
     var ligado:Boolean = false

    fun desligarMotor(){
        if(!ligado){
            throw VeiculoDesligadoException("O motor já está desligado")
        }
        ligado = false
    }

    fun ligarMotor(){
        if(ligado){
            throw VeiculoLigadoException("O veiculo já está ligado")
        }
        ligado = true
    }

    /*fun getLigado():Boolean{
        return ligado
    }*/

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }


}