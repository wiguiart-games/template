package br.com.wiguiart.games.template.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.delay
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(): ViewModel() {
    private val _infoText = liveData {
        while (true) {
            emit(System.currentTimeMillis().toString())
            delay(1000)
        }
    }
    val infoText: LiveData<String> = _infoText
}