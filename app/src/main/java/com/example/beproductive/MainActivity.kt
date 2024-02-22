package com.example.beproductive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beproductive.databinding.ActivityMainBinding
import com.example.beproductive.frg.SplashFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpUI()
        listentAppEvent()
        listentLiveData()
    }

    private fun setUpUI() {
        supportFragmentManager.beginTransaction().replace(R.id.ln_main, SplashFragment()).commit()
    }

    private fun listentAppEvent() {

    }

    private fun listentLiveData() {

    }
}