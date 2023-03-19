package pt.ulusofona.cm.kotlin.challange.models

class Bicicleta(identificador:String): Veiculo(identificador) {
    override fun requerCarta(): Boolean {
        return false
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | ${dataDeAquisicao} | Posicao | x:${posicao.x} | y:${posicao.y}"
    }


}