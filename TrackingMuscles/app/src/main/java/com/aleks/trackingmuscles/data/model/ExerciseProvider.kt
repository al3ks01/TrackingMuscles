package com.aleks.trackingmuscles.data.model

import com.aleks.trackingmuscles.data.Musculo

class ExerciseProvider {

    companion object{

        private val exercises = listOf<ExerciseModel>(

            ExerciseModel("Press de banca",
            Musculo.PECHO)

        )

        fun getExercise(): ExerciseModel {

            return exercises[0]

        }
    }

}
