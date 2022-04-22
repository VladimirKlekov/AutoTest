package ru.netology

import creditTransferLimitWithVKPay
import debitTransferLimitOnVKPay
import org.junit.Test

import org.junit.Assert.*
import percentMastercardAndMaestro
import percentVizaAndMir
import transferLimitMastercardAndMaestro
import transferLimitVizaAndMir

class MainKtTest {

    @Test
    fun creditTransferLimitWithVKPay() {
        //arrange
        val testAmount = 40_000
        val test = "Лимит по крате превышен"

        //act
        creditTransferLimitWithVKPay(
            amount = testAmount,

            )
        //assert
        assertEquals("Лимит по крате превышен", test)

    }


    @Test
    fun debitTransferLimitOnVKPay() {
        //arrange
        val testAmount = 600_000
        val test = "Лимит по крате превышен"

        //act
        debitTransferLimitOnVKPay(
            amount = testAmount

            )
        //assert
        assertEquals("Лимит по крате превышен", test)

    }

    @Test
    fun transferLimitMastercardAndMaestro() {
        //arrange
        val testAmount = 600_000
        val test = "Лимит по крате превышен"

        //act
        transferLimitMastercardAndMaestro(
            amount = testAmount
            )
        //assert
        assertEquals("Лимит по крате превышен", test)
    }

    @Test
    fun transferLimitVizaAndMir() {
        //arrange
        val testAmount = 600_000
        val test = "Лимит по крате превышен"

        //act
        transferLimitVizaAndMir(
            amount = testAmount,

            )
        //assert
        assertEquals("Лимит по крате превышен", test)
    }

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
}