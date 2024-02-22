package com.example.beproductive.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class NoteDetailVM: ViewModel() {

    var time = MutableLiveData<String>()

    fun getCurrentFormattedTimestamp() {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        val currentDate = Date(System.currentTimeMillis())
        time.value = dateFormat.format(currentDate)
    }
}