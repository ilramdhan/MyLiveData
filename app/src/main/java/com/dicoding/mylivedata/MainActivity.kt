package com.dicoding.mylivedata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mylivedata.databinding.ActivityMainBinding
import com.dicoding.mylivedata.ui.theme.MyLiveDataTheme

class MainActivity : AppCompatActivity() {

    private lateinit var liveDataTimerViewModel: MainViewModel
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        liveDataTimerViewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}