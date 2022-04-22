var amountMastercardAndMaestro: Int = 0
var amountVkPay: Int = 0
var amountVizaAndMir: Int = 0


const val ACTION_MIN_SUM_TRANSFER_MASTER_AND_MAESTRO_RUB = 300
const val ACTION_MAX_SUM_TRANSFER_MASTER_AND_MAESTRO_RUB = 75_000
const val COMMISSION_MASTER_AND_MAESTRO_PERCENT = 0.6
const val COMMISSION_AMOUNT_MASTER_AND_MAESTRO_RUB = 20

const val COMMISSION_VISA_AND_MIR_PERCENT = 0.75
const val COMMISSION_AMOUNT_PERCENT_VISA_AND_MIR_RUB = 35

const val LIMIT_TRANSFER_CARD_IN_DAY_RUB = 150_000
const val LIMIT_TRANSFER_CARD_IN_MONTH_RUB = 600_000

const val LIMIT_TRANSFER_VKPAY_IN_DAY_RUB = 15_000
const val LIMIT_TRANSFER_VKPAY_IN_MONTH_RUB = 40_000


fun main() {

    while (true) {
        println("Выберите тип операции для перечисления денежных средств:")
        println("1. Перевод с карт Mastercard и Maestro на счет VK pay")
        println("2. Перевод с Mastercard и Maestro на счет в другой платежной системе")
        println("3. Перевод с карт Visa and Мир на счет VK pay")
        println("4. Перевод с Visa and Мир на счет в другой платежной системе")
        println("5. Перевод со счета VK pay на другой счет VK pay ")
        println("6. Перевод со счета VK pay на на счет в другой платежной системе ")
        println("Введите end для выхода")
        println("_____________________________________")
        val chek = readln()
        if (chek == "end") {
            println("Программа завершена! Спасибо за помощь в учебе!!!\uD83E\uDD17")
            break
        }

        println("Введите сумму перевода в рублях:")
        val amount: Int = readLine()!!.toInt()

        val inputTransfer = chek?.toInt()
        when (inputTransfer) {
            1 -> debitTransferLimitOnVKPay(amount);
            2 -> transferLimitMastercardAndMaestro(amount);
            3 -> transferLimitMastercardAndMaestro(amount);
            4 -> transferLimitVizaAndMir(amount);
            5 -> debitTransferLimitOnVKPay(amount);
            6 -> creditTransferLimitWithVKPay(amount);
        else -> {
                print("Ошибка ввода. Выберите правильный вариант")
            }
        }

    }

}
fun creditTransferLimitWithVKPay(amount: Int) {

    if (amount < LIMIT_TRANSFER_VKPAY_IN_DAY_RUB && amountVkPay < LIMIT_TRANSFER_VKPAY_IN_MONTH_RUB) {
        amountVkPay += amount
        println("Сумма комиссии составила 0 рублей")

    } else {
        println("Лимит по крате превышен")
    }

}

fun debitTransferLimitOnVKPay(amount: Int) {

    if (amount < LIMIT_TRANSFER_CARD_IN_DAY_RUB && amountVkPay < LIMIT_TRANSFER_CARD_IN_MONTH_RUB) {
        amountVkPay += amount
        println("Сумма комиссии составила 0 рублей")

    } else { val messange: String = "Лимит по крате превышен"
        println("Лимит по крате превышен")
    }

}


fun transferLimitMastercardAndMaestro(amount: Int) {

    if (amount < LIMIT_TRANSFER_CARD_IN_DAY_RUB && amountMastercardAndMaestro < LIMIT_TRANSFER_CARD_IN_MONTH_RUB) {
        amountMastercardAndMaestro += amount
        println(
            "Сумма комиссии составила " +
                    percentMastercardAndMaestro(amount) + " рублей"
        )

    } else {
        println("Лимит по крате превышен")
    }


}

fun transferLimitVizaAndMir(amount: Int) {

    if (amount < LIMIT_TRANSFER_CARD_IN_DAY_RUB && amountMastercardAndMaestro < LIMIT_TRANSFER_CARD_IN_MONTH_RUB) {
        amountVizaAndMir += amount
        println(
            "Сумма комиссии составила " +
                    percentVizaAndMir(amount) + " рублей"
        )

    } else {
        println("Лимит по крате превышен")
    }


}

fun percentMastercardAndMaestro(amount: Int): Number {

    val percent =
        if (amount > ACTION_MIN_SUM_TRANSFER_MASTER_AND_MAESTRO_RUB
            && amount < ACTION_MAX_SUM_TRANSFER_MASTER_AND_MAESTRO_RUB
        ) {
            amount * 0
        } else {
           amount / 100 * COMMISSION_MASTER_AND_MAESTRO_PERCENT + COMMISSION_AMOUNT_MASTER_AND_MAESTRO_RUB

        }
    return percent

}

fun percentVizaAndMir(amount: Int): Number {
    val percent =
        if (amount > 0) {
            (amount / 100 * COMMISSION_VISA_AND_MIR_PERCENT-COMMISSION_AMOUNT_PERCENT_VISA_AND_MIR_RUB) + COMMISSION_AMOUNT_PERCENT_VISA_AND_MIR_RUB
        } else amount / -1

    return percent

}












