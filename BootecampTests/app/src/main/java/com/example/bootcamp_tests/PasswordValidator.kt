package com.example.bootcamp_tests

class PasswordValidator {

    /**
    Password Válido:
     - Tamanho mínimo 8
     - Uma letra maiúscula
     - Uma letra minúscula
     - Um número
     - Um caractere especial
     **/

    fun validatePassword(password: String): Boolean {
        val lenPassword = validateLenPassword(password)
        val upperCase = validateUpperCase(password)
        val loweCase = validateLowerCase(password)
        val numberInPassword = validateNumber(password)
        val specialCharacterInPassword = validateSpecialCharacter(password)

        return lenPassword and upperCase and loweCase and numberInPassword and specialCharacterInPassword
    }

    fun validateLenPassword(password: String): Boolean {
        return password.length >= 8
    }

    fun validateUpperCase(password: String): Boolean {
        val regex = "[A-Z]".toRegex()

        return (regex.containsMatchIn(password))
    }

    fun validateLowerCase(password: String): Boolean {
        val regex = "[a-z]".toRegex()

        return (regex.containsMatchIn(password))
    }

    fun validateNumber(password: String): Boolean {
        val regex = "[0-9]".toRegex()

        return (regex.containsMatchIn(password))
    }

    fun validateSpecialCharacter(password: String): Boolean {
        val regex = "[^A-Za-z0-9]".toRegex()

        return (regex.containsMatchIn(password))
    }
}
