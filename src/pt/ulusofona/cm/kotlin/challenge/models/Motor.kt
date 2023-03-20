package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException

class Motor(private val cavalos:Int, private val cilindrada:Int) {
    private var ligado:Boolean = false

    fun getCilindrada():Int{
        return cilindrada
    }

    fun getCavalos():Int{
        return cavalos
    }

    fun desligarMotor(){
        if(!ligado){
            throw VeiculoDesligadoException("O motor já está desligado")
        }
        ligado = false
    }

    fun ligarMotor(){
        if(ligado){
            throw VeiculoDesligadoException("O veiculo já está ligado")
        }
        ligado = true
    }

    fun getLigado():Boolean{
        return ligado
    }

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }


}