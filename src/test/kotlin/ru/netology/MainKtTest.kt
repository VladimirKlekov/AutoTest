package ru.netology

import creditTransferLimitWithVKPay
import org.junit.Test

import org.junit.Assert.*
import percentMastercardAndMaestro
import percentVizaAndMir

class MainKtTest {
    //
    @Test
    fun percentMastercardAndMaestro() {
        //arrange
        val testAmount = 100_000

        //act
        val result = percentMastercardAndMaestro(
            amount = testAmount,
        )
        //assert
        assertEquals(620.0, result)
    }

    @Test
    fun percentVizaAndMir() {
        //arrange
        val testAmount = 100_000

        //act
        val result = percentVizaAndMir(
            amount = testAmount,
        )
        //assert
        assertEquals(750.0, result)
    }

    @Test
    fun main() {
    }

    @Test
    fun creditTransferLimitWithVKPay() {

    }

    @Test
    fun debitTransferLimitOnVKPay() {
    }

    @Test
    fun transferLimitMastercardAndMaestro() {
    }

    @Test
    fun transferLimitVizaAndMir() {
    }


}