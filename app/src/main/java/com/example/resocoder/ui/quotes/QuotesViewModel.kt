package com.example.resocoder.ui.quotes

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.resocoder.data.Quote
import com.example.resocoder.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
 }