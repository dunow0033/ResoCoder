package com.example.resocoder.utilities

import com.example.resocoder.data.FakeDatabase
import com.example.resocoder.data.FakeQuoteDao
import com.example.resocoder.data.QuoteRepository
import com.example.resocoder.ui.quotes.QuotesViewModel
import com.example.resocoder.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactor(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}