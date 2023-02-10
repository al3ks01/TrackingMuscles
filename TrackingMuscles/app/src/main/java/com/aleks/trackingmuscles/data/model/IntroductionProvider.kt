package com.aleks.trackingmuscles.data.model

import com.aleks.trackingmuscles.data.IntroductionMessage

class IntroductionProvider {
    companion object{
        var introductionMessages:List<IntroductionMessage> = listOf(
            IntroductionMessage("Bienvenido a la aplicación de TrackingMuscles",false),
            IntroductionMessage("Esta aplicación está hecha para todos aquellos que quieran tener un seguimiento de su evolución en los ejercicios del gimnasio",false),
            IntroductionMessage("Dicho esto, ¿cómo te llamas?", true))

    }
}