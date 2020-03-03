package com.example.bootcamp_tests

import org.junit.Test

import org.junit.Assert.*

class PasswordValidatorTest {

    @Test
    fun givenPasswordCorrect_whenValidate_shouldReturnTrue(){
        val result = PasswordValidator().validatePassword("AbcCeF3!#")
        assertTrue(result)
    }

    @Test
    fun givenPasswordLengthIsShorterThan8_whenValidate_shouldReturnFalse() {
        val result = PasswordValidator().validateLenPassword("123abc")
        assertFalse(result)
    }

    @Test
    fun givenPasswordDoesNotContainUpperCase_whenValidate_shouldReturnFalse(){
        val result = PasswordValidator().validateUpperCase("a1b1c1")
        assertFalse(result)
    }

    @Test
    fun givenPasswordDoesNotContainLowerCase_whenValidate_shouldReturnFalse(){
        val result = PasswordValidator().validateLowerCase("ABCD")
        assertFalse(result)
    }

    @Test
    fun givenPasswordDoesNotContainNumbers_whenValidate_shouldReturnFalse(){
        val result = PasswordValidator().validateNumber("abcd")
        assertFalse(result)
    }

    @Test
    fun givenPasswordDoesNotContainSpecialCharacters_whenValidate_shouldReturnFalse(){
        val result = PasswordValidator().validateSpecialCharacter("abcdef")
        assertFalse(result)
    }
}
