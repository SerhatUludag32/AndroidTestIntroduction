package com.serhatuludag.androidtestintroduction

class Tax {

    // TDD -> Test Driven Development

    fun calculateTax(income: Double, taxRate: Double): Double {
        return income * taxRate
    }

    fun calculateIncome(income: Double, taxRate: Double): Double {
        return income - (income * taxRate)
    }
}