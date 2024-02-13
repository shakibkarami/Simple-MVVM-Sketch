package com.practice.simplemvvm.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.practice.simplemvvm.domain.repository.Repository
import kotlinx.coroutines.launch

class ViewModel(
    val repository: Repository
): ViewModel() {

    init {
        viewModelScope.launch {
            repository.getData()
        }
    }

}