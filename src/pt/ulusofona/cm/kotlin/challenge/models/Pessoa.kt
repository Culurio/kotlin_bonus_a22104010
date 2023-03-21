package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class Pessoa(val nome:String,val dataDeNascimento: Date):Movimentavel {
    val veiculos: ArrayList<Veiculo> = ArrayList()
    var carta:Carta? = null
    var posicao:Posicao = Posicao(0,0)
    val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.UK)

    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador:String):Veiculo?{
        for(veiculo in veiculos){
            if (veiculo.identificador == identificador) {
                return veiculo
            }
        }
        throw VeiculoNaoEncontradoException("Veiculo não existe")
    }

    fun venderVeiculo(identificador: String, comprador:Pessoa){
        //TODO
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
        val veiculo = pesquisarVeiculo(identificador)
        if(veiculo != null){
            if(veiculo.requerCarta() && !temCarta()){
                throw  PessoaSemCartaException(nome)
            }
            veiculo.moverPara(x,y)
            moverPara(x,y)
        }else {
            throw VeiculoNaoEncontradoException("Este veiculo não existe")
        }
    }

    fun temCarta():Boolean{
        if (carta != null){
            return true
        }
        return false
    }

    fun maiorDeIdade(): Boolean {
        val now = Date()
        val idadeEmMilis = now.time - dataDeNascimento.time
        val idadeEmAnos = idadeEmMilis / 1000L / 60L / 60L / 24L / 365L
        return idadeEmAnos >= 18L
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
        return "Pessoa | $nome | ${dateFormat.format(dataDeNascimento)} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}