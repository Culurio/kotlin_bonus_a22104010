package pt.ulusofona.cm.kotlin.challange.models

class Motor(val cavalos:Int, val cilindrada:Int) {
    var ligado:Boolean = false


    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }


}