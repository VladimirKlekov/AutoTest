package ru.netology

import ACTION_MAX_SUM_TRANSFER_MASTER_AND_MAESTRO_RUB
import ACTION_MIN_SUM_TRANSFER_MASTER_AND_MAESTRO_RUB
import LIMIT_TRANSFER_CARD_IN_DAY_RUB
import LIMIT_TRANSFER_CARD_IN_MONTH_RUB
import LIMIT_TRANSFER_VKPAY_IN_DAY_RUB
import LIMIT_TRANSFER_VKPAY_IN_MONTH_RUB
import amountMastercardAndMaestro
import amountVizaAndMir
import amountVkPay
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
        val testAmount = 600_000
        val sum = 0

        //act
        creditTransferLimitWithVKPay(
            amount = testAmount
        )
        //assert
        assertEquals(amountVkPay, sum)

    }

    @Test
    fun credit_TransferLimitWithVKPay() {
        //arrange
        val testAmount = 15_000
        val limit = 15000

        //act
        creditTransferLimitWithVKPay(
            amount = testAmount
        )
        //assert
        assertEquals(LIMIT_TRANSFER_VKPAY_IN_DAY_RUB, limit)
        assertEquals(amountVkPay, 0)



    }

    //__________________________________________________

    @Test
    fun debit_TransferLimitOnVKPay() {
        //arrange
        val testAmount = 600_001
        val testLimit = 600_000
        //act
        debitTransferLimitOnVKPay(
            amount = testAmount
        )
        //assert

        assertEquals(600000, testLimit)
    }
    //__________________________________________________

    @Test
    fun transfer_Limit_MastercardAndMaestro() {
        //arrange
        val testAmount = 100_000


        //act
        transferLimitMastercardAndMaestro(
            amount = testAmount
        )
        //assert
        assertEquals(LIMIT_TRANSFER_CARD_IN_MONTH_RUB, 600_000)
        assertEquals(percentMastercardAndMaestro(testAmount),620.0)
        assertEquals(amountMastercardAndMaestro, 100_000)
        assertEquals(LIMIT_TRANSFER_CARD_IN_DAY_RUB, 150_000)

    }


    @Test
    fun  transfer_LimitMastercar_dAndMaestro() {
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

        //act
        transferLimitVizaAndMir(
            amount = testAmount
            )
        //assert
        assertEquals(20000, testAmount)
        percentVizaAndMir(100)
        assertEquals(amountVizaAndMir, 20000)

    }
    //__________________________________________________

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
    fun percen_tMastercardAndMaestro() {
        //arrange
        val testAmount = 0

        //act
        val result = percentMastercardAndMaestro(
            amount = testAmount,
        )
        //assert
        assertEquals(20.0, result)

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


}