package com.example.pam7_118.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pam7_118.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel(){
    private val _uiState = MutableStateFlow(DataSiswa())
    val uiState : StateFlow<DataSiswa> = _uiState.asStateFlow()

    fun saveDataSiswa(ls:MutableList<String>){
        _uiState.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2],
                email = ls[3],
                notelepon = ls[4]

            )
        }
    }
}