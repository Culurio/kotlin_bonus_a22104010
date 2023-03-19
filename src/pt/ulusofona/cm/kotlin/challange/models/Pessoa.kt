package pt.ulusofona.cm.kotlin.challange.models

import pt.ulusofona.cm.kotlin.challange.interfaces.Movimentavel
import java.util.*

class Pessoa(val nome:String,val dataDeNascimento:Date = Date()):Movimentavel {
    val veiculos: ArrayList<Veiculo> = ArrayList<Veiculo>()
    var carta:Carta? = null
    var posicao:Posicao = Posicao(0,0)

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador:String):Veiculo{
        //TODO
        return Veiculo() ;
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

    fun tirarCarta(){
        carta = Carta()
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x,y)
    }
}