package com.aleks.trackingmuscles.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aleks.trackingmuscles.data.model.ExerciseModel
import com.aleks.trackingmuscles.data.model.ExerciseProvider

class ExerciseViewModel: ViewModel() {

    val exerciseModel = MutableLiveData<ExerciseModel>()

    fun hacerAlgo(){

        val currentExercise = ExerciseProvider.getExercise()

        exerciseModel.postValue(currentExercise)
    }

}