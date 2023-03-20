package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(val cavalos:Int, val cilindrada:Int):Ligavel {
     var ligado:Boolean = false

    override fun ligar() {
        if(ligado){
            throw VeiculoLigadoException("O veiculo já está ligado")
        }
        ligado = true
    }

    override fun desligar() {
        if(!ligado){
            throw VeiculoDesligadoException("O motor já está desligado")
        }
        ligado = false
    }

    override fun estaLigado(): Boolean {
        return ligado
    }


    /*fun getLigado():Boolean{
        return ligado
    }*/

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }


}