package com.example.valentineitemsapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ValentineViewModel : ViewModel(){
    private val uiState = MutableStateFlow(ValentineUiState())
    val _uiState:StateFlow<ValentineUiState> = uiState.asStateFlow()


}