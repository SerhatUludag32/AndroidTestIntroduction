package com.serhatuludag.androidtestintroduction

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class TaxTest {

    private lateinit var tax : Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @After
    fun tearDown() {

    }


    @Test
    fun calculateTaxTest() {
        val netTax = tax.calculateTax(100.0, 0.1)
        assertEquals(10.0, netTax, 0.0)
    }

    @Test
    fun calculateIncomeTest() {
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertEquals(90.0, netIncome, 0.0)

    }
}