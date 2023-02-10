package com.aleks.trackingmuscles.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.aleks.trackingmuscles.databinding.ActivityMainBinding
import com.aleks.trackingmuscles.ui.viewmodel.IntroductionViewModel
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private val introductionViewModel: IntroductionViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        introductionViewModel.onCreate()

        introductionViewModel.introductionModel.observe(this, Observer {
            binding.tvMain.text = it

        })
        introductionViewModel.isLoading.observe(this, Observer {
            binding.pbMain.isVisible = it

        })
        introductionViewModel.lastMessage.observe(this, Observer {
            binding.edMain.isVisible = it
        })

        binding.viewContainer.setOnClickListener{
            introductionViewModel.next()

        }

    }
}