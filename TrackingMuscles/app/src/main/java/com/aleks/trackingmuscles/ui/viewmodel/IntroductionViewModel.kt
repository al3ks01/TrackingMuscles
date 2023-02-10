package com.aleks.trackingmuscles.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aleks.trackingmuscles.domain.IntroductionUseCase
import com.aleks.trackingmuscles.domain.NextIntroductionUseCase
import kotlinx.coroutines.launch

class IntroductionViewModel: ViewModel() {

    val introductionModel = MutableLiveData<String>()
    val isLoading = MutableLiveData<Boolean>()
    val lastMessage = MutableLiveData<Boolean>()
    private var getIntroductionUseCase = IntroductionUseCase()
    private var getNextIntroductionUseCase = NextIntroductionUseCase()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)

            val result = getIntroductionUseCase()

            introductionModel.postValue(result[0].message)
            isLoading.postValue(false)
        }
    }

    fun next(){
        viewModelScope.launch {
            isLoading.postValue(true)

            val result = getNextIntroductionUseCase()

            introductionModel.postValue(result.message)

            isLoading.postValue(false)
            if(result.isLast){
                lastMessage.postValue(true)
            }
        }

    }

}