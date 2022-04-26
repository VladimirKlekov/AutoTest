package ru.netology


import amountMastercardAndMaestro
import amountVizaAndMir
import amountVkPay
import amountVkPayDeb
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
        val testAmount = 10000
        amountVkPay = 0
        //act
        creditTransferLimitWithVKPay(
            amount = testAmount
        )
        //assert
        assertEquals(amountVkPay, 10000)
    }

    @Test
    fun credit_TransferLimitWithVKPay() {
        //arrange
        val testAmount = 20000
        amountVkPay = 0
        //act
        creditTransferLimitWithVKPay(
            amount = testAmount
        )
        //assert
        assertEquals(amountVkPay, 0)
    }


    //__________________________________________________

    @Test
    fun debit_TransferLimitOnVKPay() {
        //arrange
        val testAmount = 100_000
        amountVkPayDeb = 0
        //act
        debitTransferLimitOnVKPay(
            amount = testAmount
        )
        //assert
        assertEquals(amountVkPayDeb, 100000)
//
    }

    @Test
    fun debitTransferLimitOnVKPay() {
        //arrange
        val testAmount = 200_000
        amountVkPayDeb = 0
        //act
        debitTransferLimitOnVKPay(
            amount = testAmount
        )
        //assert
        assertEquals(amountVkPayDeb, 0)
//
    }
    //__________________________________________________

    @Test
    fun transfer_Limit_MastercardAndMaestro() {
        //arrange
        val testAmount = 100_000
        amountMastercardAndMaestro = 0
        //act
        transferLimitMastercardAndMaestro(
            amount = testAmount
        )
        //assert
        assertEquals(amountMastercardAndMaestro, 100_000)

    }


    @Test
    fun transfer_LimitMastercar_dAndMaestro() {
        //arrange
        val testAmount = 200_000
        amountMastercardAndMaestro = 0
        //act
        transferLimitMastercardAndMaestro(
            amount = testAmount
        )
        //assert
        assertEquals(amountMastercardAndMaestro, 0)

    }

    //__________________________________________________
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
    fun transfer_LimitVizaAndMir() {
        //arrange
        val testAmount = 20_000
        amountVizaAndMir = 50000

        //act
        transferLimitVizaAndMir(
            amount = testAmount
        )
        //assert
        assertEquals(20000, testAmount)
        percentVizaAndMir(100)
        assertEquals(amountVizaAndMir, 70000)

    }
    //__________________________________________________

    @Test
    fun percentMastercardAndMaestro() {
        //arrange
        val testAmount = 100
        //act
        val result = percentMastercardAndMaestro(
            amount = testAmount,
        )
        //assert
        assertEquals(20.6, result)

    }


    @Test
    fun percent_MastercardAndMaestro() {
        //arrange
        val testAmount = 200_000
        //act
        val result = percentMastercardAndMaestro(
            amount = testAmount,
        )
        //assert
        assertEquals(1220.0, result)
    }

    @Test
    fun percent_Mastercard_AndMaestro() {
        //arrange
        val testAmount = 50_000
        //act
        val result = percentMastercardAndMaestro(
            amount = testAmount,
        )
        //assert
        assertEquals(0, result)
    }

    //__________________________________________________
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
    fun percent_VizaAndMir() {
        //arrange
        val testAmount = 0
        //act
        val result = percentVizaAndMir(
            amount = testAmount,
        )
        //assert
        assertEquals(0, result)

    }

//    @Test
//    fun main() {
//
//    }
}


