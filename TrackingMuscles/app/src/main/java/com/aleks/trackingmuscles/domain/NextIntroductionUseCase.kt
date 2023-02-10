package com.aleks.trackingmuscles.domain

import com.aleks.trackingmuscles.data.IntroductionMessage
import com.aleks.trackingmuscles.data.model.IntroductionProvider

class NextIntroductionUseCase {

    private var messageNumber = 0

    suspend operator  fun invoke():IntroductionMessage {

        if (messageNumber < 2) {
            messageNumber++
        }
        return IntroductionProvider.introductionMessages[messageNumber]
    }
}