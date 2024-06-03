package ru.netology

fun main() {
    moneyTransfers()
    people()
    musicLover()
}

fun moneyTransfers() {
    val minCommission = 35
    val amount = 1_000
    val commission = 0.0075
    val totalCommission = amount * commission
    val result =
        if (totalCommission < minCommission) totalCommission + minCommission else totalCommission // totalCommission < minCommission всегда true значит можно сделать(val result = totalCommission + minCommission)
    println(result)
}

fun people() {
    val likes = 2521
    val people: String = if (likes % 10 == 1) "человеку" else "людям"
    println("Понравилось $likes $people")
}

fun musicLover() {
    val startStandardDiscount = 1_001
    val startMaxDiscount = 10_001
    val standardDiscount = 100
    val maxDiscount = 0.95
    val discountPremiumUser = 0.99
    val amount = 15_000
    val premiumUser: Boolean = true

    val totalDiscount: Double
    if (premiumUser == true) {
        totalDiscount = if (amount > startMaxDiscount) {
            amount * maxDiscount * discountPremiumUser
        } else if (amount > startStandardDiscount) {
            (amount - standardDiscount.toDouble()) * discountPremiumUser
        } else {
            amount * discountPremiumUser
        }
    } else {
        totalDiscount = if (amount > startMaxDiscount) {
            amount * maxDiscount
        } else if (amount > startStandardDiscount) {
            (amount - standardDiscount.toDouble())
        } else {
            amount.toDouble()
        }
    }
    println(totalDiscount.toInt())
}