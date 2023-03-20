package pt.ulusofona.cm.kotlin.challange.models

import pt.ulusofona.cm.kotlin.challange.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challange.interfaces.Movimentavel
import java.time.LocalDate
import java.time.Period

class Pessoa(val nome:String,val dataDeNascimento:LocalDate):Movimentavel {
    val veiculos: ArrayList<Veiculo> = ArrayList<Veiculo>()
    var carta:Carta? = null
    var posicao:Posicao = Posicao(0,0)

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador:String):Veiculo?{
        val veiculoId = identificador
        for(veiculo in veiculos){
            if(veiculo.identificador == veiculoId){
                return veiculo
            }
        }
        return null
    }

    fun venderVeiculo(identificador: String, comprador:Pessoa){
        //TODO
    }

    fun moverVeiculoPara(identificador: String, x:Int, y:Int){
        //TODO
    }

    fun temCarta():Boolean{
        if (carta != null){
            return true
        }
        return false
    }

    fun maiorDeIdade(): Boolean {
        val age = Period.between(dataDeNascimento, LocalDate.now()).years
        return age >= 18
    }

    fun tirarCarta(){
        if(maiorDeIdade()){
            carta = Carta()
        }else{
            throw MenorDeIdadeException("A pessoa é menor de 18")
        }
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x,y)
    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}