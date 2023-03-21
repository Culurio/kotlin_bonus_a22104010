package pt.ulusofona.cm.kotlin.challenge.exceptions

import java.lang.Exception

class PessoaSemCartaException(s: String) : Exception() {
    override val message: String?
        get() = "Person does not have a license."
}