package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.Instant
import java.util.*
import kotlin.collections.ArrayList

class Pessoa(val nome:String,val dataDeNascimento: Date):Movimentavel {
    val veiculos: ArrayList<Veiculo> = ArrayList()
    var carta:Carta? = null
    var posicao:Posicao = Posicao(0,0)

    fun comprarVeiculo(veiculo: Veiculo){
        veiculo.dataDeAquisicao = Date.from(Instant.now())
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador:String):Veiculo?{
        for(veiculo in veiculos){
            if (veiculo.identificador == identificador) {
                return veiculo
            }
        }
        return null
    }

    fun venderVeiculo(identificador: String, comprador:Pessoa){
        //TODO
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
        pesquisarVeiculo(identificador)?.moverPara(x, y)
        moverPara(x,y)

    }

    fun temCarta():Boolean{
        if (carta != null){
            return true
        }
        return false
    }

    fun maiorDeIdade(): Boolean {
        return true
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