package com.aleks.trackingmuscles.domain

import com.aleks.trackingmuscles.data.IntroductionMessage
import com.aleks.trackingmuscles.data.model.IntroductionProvider

class IntroductionUseCase {


    suspend operator fun invoke():List<IntroductionMessage> {

        //val messages = IntroductionProvider.introductionMessages

        //return messages

        return IntroductionProvider.introductionMessages
    }
}